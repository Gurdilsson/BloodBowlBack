package com.BloodBowl.BloodBowl.BasePlayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasePlayerService {
	
	@Autowired
	BasePlayerRepository basePlayerRepository;
	
	protected Iterable<BasePlayer> findAllBasePlayer() {
		return basePlayerRepository.findAll();
	}

}
