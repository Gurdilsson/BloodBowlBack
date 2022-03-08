package com.BloodBowl.BloodBowl.Player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/player")
public class PlayerController {

	@Autowired
	private PlayerService playerService;

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<Player> getAllPlayers() {
		return playerService.findAllPlayer();
	}

	@GetMapping(path = "/team/{id}")
	public @ResponseBody Iterable<Player> getAllPlayerByTeam(@PathVariable("id")int id){
		return playerService.findAllPlayerByTeamId(id);
	}

}
