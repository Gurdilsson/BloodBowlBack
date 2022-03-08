package com.BloodBowl.BloodBowl.Player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

	@Autowired
	PlayerRepository playerRepository;

	protected Iterable<Player> findAllPlayer() {
		return playerRepository.findAll();
	}

	protected Iterable<Player> findAllPlayerByTeamId(int id) {
		return playerRepository.findAllByTeamId(id);
	}

	public Player createPlayer(Player player) {
		return playerRepository.save(player);
	}
}
