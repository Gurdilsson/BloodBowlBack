package com.BloodBowl.BloodBowl.Player;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<Player, Integer> {

	List<Player> findAllByTeamId(int teamId);
}
