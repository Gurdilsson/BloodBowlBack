package com.BloodBowl.BloodBowl.BasePlayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/base-player")
public class BasePlayerController {
	
	@Autowired
	BasePlayerService basePlayerService;
	
	@GetMapping(path = "/all")
	public @ResponseBody Iterable<BasePlayer> getAllBasePlayers() {
		return basePlayerService.findAllBasePlayer();
	}

}
