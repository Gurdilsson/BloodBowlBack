package com.BloodBowl.BloodBowl.Skill;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Skills {

	@Id
	@Column(name = "skill_id")
	private String skillId;

	@Column(name = "skill_name")
	private String skillName;

	@Column(name = "skill_type")
	private String skillType;

	@Column(name = "skill_description")
	private String skillDescription;

	public String getSkillId() {
		return skillId;
	}

	public void setSkillId(String skillId) {
		this.skillId = skillId;
	}

	public String getSkillType() {
		return skillType;
	}

	public void setSkillType(String skillType) {
		this.skillType = skillType;
	}

	public String getSkillDescription() {
		return skillDescription;
	}

	public void setSkillDescription(String skillDescription) {
		this.skillDescription = skillDescription;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

}
