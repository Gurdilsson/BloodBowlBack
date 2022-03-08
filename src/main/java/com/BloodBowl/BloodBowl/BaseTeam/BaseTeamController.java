package com.BloodBowl.BloodBowl.BaseTeam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/base-team")
public class BaseTeamController {
	
	@Autowired
	BaseTeamService baseTeamService;
	
	@GetMapping(path = "/all")
	public @ResponseBody Iterable<BaseTeam> getAllBaseTeams() {
		return baseTeamService.findAllBaseTeams();
	}

}
