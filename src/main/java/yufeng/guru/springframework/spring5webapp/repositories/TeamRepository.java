package yufeng.guru.springframework.spring5webapp.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import yufeng.guru.springframework.spring5webapp.domain.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, String> {
	
	public Optional<Team> findById(int id);
	
//	public List<Team> findByExample(Example<Team> example);
}
