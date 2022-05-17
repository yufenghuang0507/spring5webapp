package yufeng.guru.springframework.spring5webapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import yufeng.guru.springframework.spring5webapp.domain.Team;
import yufeng.guru.springframework.spring5webapp.exception.TeamNotFoundException;
import yufeng.guru.springframework.spring5webapp.repositories.TeamRepository;

@Service
public class TeamService {
	@Autowired
	TeamRepository teamRepo;
	
	public List<Team> findAllTeams() {
		return teamRepo.findAll();
	}
	
	public Team findTeamById(int id)throws TeamNotFoundException {
		return teamRepo.findById(id)
					   .orElseThrow(() -> new TeamNotFoundException("Team by id " + id + " was not found"));
	}
	
	public Team addTeam(Team team) {
		return teamRepo.save(team);
	}
	
	public List<Team> findAll(Team params) {
//		ExampleMatcher matcher = ExampleMatcher.matching();
											   
		Example<Team> example = Example.of(params);
		
		return teamRepo.findAll(example);
//		return teamRepo.findByExample(example);
	}
}
