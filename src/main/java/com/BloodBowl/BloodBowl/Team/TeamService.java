package com.BloodBowl.BloodBowl.Team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {

	@Autowired
	TeamRepository teamRepository;
	
	protected Iterable<Team> findAll() {
		return teamRepository.findAll();
	}
	
	protected Iterable<Team> findAllTeamByUserId(int userId) {
		return teamRepository.findAllByUserId(userId);
	}
	
	
	protected Team createTeam(Team team) {
		return teamRepository.save(team);
	}
}
