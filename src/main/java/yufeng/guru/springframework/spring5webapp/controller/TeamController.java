package yufeng.guru.springframework.spring5webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import yufeng.guru.springframework.spring5webapp.domain.Team;
import yufeng.guru.springframework.spring5webapp.exception.TeamNotFoundException;
import yufeng.guru.springframework.spring5webapp.service.TeamService;

import java.util.List;

@RestController
@RequestMapping("/api/teams")
public class TeamController {

	@Autowired
	TeamService teamService;
	
	@GetMapping
	public ResponseEntity<List<Team>> getTeams() {
		return ResponseEntity.ok()
						     .body(teamService.findAllTeams());
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Team> getTeamById(@PathVariable("id")int id) {
		Team team = null;
		try{
			team = teamService.findTeamById(id);
		}catch(TeamNotFoundException ex) {
			System.out.println("getMessage() : " + ex.getMessage());
			System.out.println("getCause() : " + ex.getCause());
//			System.out.println("getStackTrace() : " + Arrays.toString(ex.getStackTrace()));
			
			ex.printStackTrace();
			return ResponseEntity.notFound()
					             .build();
		}
		
		return ResponseEntity.ok()
							 .body(team);
	}
	
	@GetMapping("/find")
	public ResponseEntity<List<Team>> getTeamByCondition(Team params) {
//		LogUtil.info("getTeamByCondition~~");
		List<Team> team = null;
		try{
			System.out.println("id :: " + params.getId());
			System.out.println("conference :: " + params.getConference());
			System.out.println("getDivision :: " + params.getDivision());
			System.out.println("getCoachName :: " + params.getCoachName());
			System.out.println("getTeamName :: " + params.getTeamName());
			System.out.println("getDescription :: " + params.getDescription());
			System.out.println("getCreateDate :: " + params.getCreateDate());
			
			team = teamService.findAll(params);
//			team = teamService.findTeamById(params.getId());
		}catch(TeamNotFoundException ex) {

			return ResponseEntity.notFound()
					             .build();
		}
		return ResponseEntity.ok()
							 .body(team);
	}
	@PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE},
			     produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Team> addTeam(@RequestBody Team team) {
		return new ResponseEntity<>(teamService.addTeam(team), HttpStatus.CREATED);
	}
}
