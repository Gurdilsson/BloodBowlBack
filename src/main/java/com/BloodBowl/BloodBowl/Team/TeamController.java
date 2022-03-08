package com.BloodBowl.BloodBowl.Team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.BloodBowl.BloodBowl.Player.Player;
import com.BloodBowl.BloodBowl.Player.PlayerService;

@RestController
@RequestMapping(path = "/team")
public class TeamController {

	@Autowired
	private TeamService teamService;
	
	@Autowired
	private PlayerService playerService;
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<Team> getAllTeam() {
		return teamService.findAll();
	}
	
	@GetMapping(path = "/user/{id}")
	public @ResponseBody Iterable<Team> getAllTeamsByUserId(@PathVariable("id")int id){
		return teamService.findAllTeamByUserId(id);
	}
	
	@ResponseBody
	@PostMapping(value = "/create", consumes = "application/json", produces = "application/json")
	public ResponseEntity<?> createTeam(@RequestBody Team team) {
		Team newTeam = teamService.createTeam(team);
		for (Player player : team.getPlayers()) {
			player.setTeamId(newTeam.getTeamId());
			Player newPlayer = playerService.createPlayer(player);
			if (newPlayer == null) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		if (newTeam == null) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		} else {
			return new ResponseEntity<>(newTeam, HttpStatus.CREATED);
		}

	}
}
