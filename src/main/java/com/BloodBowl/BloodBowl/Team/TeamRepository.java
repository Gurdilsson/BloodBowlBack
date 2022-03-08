package com.BloodBowl.BloodBowl.Team;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team, Integer>{

	List<Team> findAllByUserId(int userId);
}
