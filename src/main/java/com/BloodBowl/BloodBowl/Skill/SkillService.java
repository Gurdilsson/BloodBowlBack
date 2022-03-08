package com.BloodBowl.BloodBowl.Skill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService {

	@Autowired
	private SkillRepository skillRepository;
	
	protected Iterable<Skills> findAllSkills(){
		return skillRepository.findAll();
	}
}
