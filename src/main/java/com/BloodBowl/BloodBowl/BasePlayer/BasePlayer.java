package com.BloodBowl.BloodBowl.BasePlayer;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.BloodBowl.BloodBowl.Skill.Skills;

@Entity
public class BasePlayer {

	@Id
	@Column(name = "base_player_id")
	private int basePlayerId;

	@Column(name = "base_player_role")
	private String basePlayerRole;

	@Column(name = "quantity_max")
	private int quantityMax;

	private int cost;

	private Integer movement;

	private Integer strenght;

	private Integer agility;

	@Column(name = "pass_ability")
	private Integer passAbility;

	private Integer armor;

	private String race;

	@ManyToMany
	@JoinTable(name = "base_player_skills", joinColumns = @JoinColumn(name = "base_player_id"), inverseJoinColumns = @JoinColumn(name = "skill_id"))
	private Set<Skills> skills;

	public int getBasePlayerId() {
		return basePlayerId;
	}

	public void setBasePlayerId(int basePlayerId) {
		this.basePlayerId = basePlayerId;
	}

	public String getBasePlayerRole() {
		return basePlayerRole;
	}

	public void setBasePlayerRole(String basePlayerRole) {
		this.basePlayerRole = basePlayerRole;
	}

	public int getQuantityMax() {
		return quantityMax;
	}

	public void setQuantityMax(int quantityMax) {
		this.quantityMax = quantityMax;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public Integer getMovement() {
		return movement;
	}

	public void setMovement(Integer movement) {
		this.movement = movement;
	}

	public Integer getStrenght() {
		return strenght;
	}

	public void setStrenght(Integer strenght) {
		this.strenght = strenght;
	}

	public Integer getAgility() {
		return agility;
	}

	public void setAgility(Integer agility) {
		this.agility = agility;
	}

	public Integer getPassAbility() {
		return passAbility;
	}

	public void setPassAbility(Integer passAbility) {
		this.passAbility = passAbility;
	}

	public Integer getArmor() {
		return armor;
	}

	public void setArmor(Integer armor) {
		this.armor = armor;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public Set<Skills> getSkills() {
		return skills;
	}

	public void setSkills(Set<Skills> skills) {
		this.skills = skills;
	}

}