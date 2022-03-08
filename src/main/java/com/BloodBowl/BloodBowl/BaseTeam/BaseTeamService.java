package com.BloodBowl.BloodBowl.BaseTeam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseTeamService {

	@Autowired
	private BaseTeamRepository baseTeamRepository;
	
	protected Iterable<BaseTeam> findAllBaseTeams() {
		return baseTeamRepository.findAll();
	}
}
