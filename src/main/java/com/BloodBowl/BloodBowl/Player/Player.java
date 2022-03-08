package com.BloodBowl.BloodBowl.Player;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.BloodBowl.BloodBowl.Skill.Skills;

@Entity
public class Player {

	@Id
	@Column(name = "player_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "player_name")
	private String playerName;

	private String position;

	private Integer movement;

	private Integer strenght;

	private Integer agility;

	@Column(name = "pass_ability")
	private Integer passAbility;

	@ManyToMany
	@JoinTable(name = "player_skills", joinColumns = @JoinColumn(name = "player_id"), inverseJoinColumns = @JoinColumn(name = "skill_id"))
	private Set<Skills> skills;

	@Column(name = "miss_next_match")
	private boolean missNextMatch;

	@Column(name = "persistant_injury")
	private int persistantInjury;

	private int handoff;

	private int elimination;

	private int diversion;

	private int interception;

	@Column(name = "touch_down")
	private int touchDown;

	@Column(name = "player_of_the_match")
	private int playerOfTheMatch;

	@Column(name = "player_level")
	private int playerLevel;

	private int saison;

	@Column(name = "star_player_point")
	private int starPlayerPoint;

	private Integer armor;

	private int cost;

	@Column(name = "team_id")
	private int teamId;

	// --------------------------------------GETTER AND
	// SETTERS-------------------------------------

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
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

	public Set<Skills> getSkills() {
		return skills;
	}

	public void setSkills(Set<Skills> skills) {
		this.skills = skills;
	}

	public boolean isMissNextMatch() {
		return missNextMatch;
	}

	public void setMissNextMatch(boolean missNextMatch) {
		this.missNextMatch = missNextMatch;
	}

	public int getPersistantInjury() {
		return persistantInjury;
	}

	public void setPersistantInjury(int persistantInjury) {
		this.persistantInjury = persistantInjury;
	}

	public int getHandoff() {
		return handoff;
	}

	public void setHandoff(int handoff) {
		this.handoff = handoff;
	}

	public int getDiversion() {
		return diversion;
	}

	public void setDiversion(int diversion) {
		this.diversion = diversion;
	}

	public int getInterception() {
		return interception;
	}

	public void setInterception(int interception) {
		this.interception = interception;
	}

	public int getTouchDown() {
		return touchDown;
	}

	public void setTouchDown(int touchDown) {
		this.touchDown = touchDown;
	}

	public int getPlayerOfTheMatch() {
		return playerOfTheMatch;
	}

	public void setPlayerOfTheMatch(int playerOfTheMatch) {
		this.playerOfTheMatch = playerOfTheMatch;
	}

	public int getPlayerLevel() {
		return playerLevel;
	}

	public void setPlayerLevel(int playerLevel) {
		this.playerLevel = playerLevel;
	}

	public int getSaison() {
		return saison;
	}

	public void setSaison(int saison) {
		this.saison = saison;
	}

	public int getStarPlayerPoint() {
		return starPlayerPoint;
	}

	public void setStarPlayerPoint(int starPlayerPoint) {
		this.starPlayerPoint = starPlayerPoint;
	}

	public Integer getArmor() {
		return armor;
	}

	public void setArmor(Integer armor) {
		this.armor = armor;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public int getElimination() {
		return elimination;
	}

	public void setElimination(int elimination) {
		this.elimination = elimination;
	}

}
