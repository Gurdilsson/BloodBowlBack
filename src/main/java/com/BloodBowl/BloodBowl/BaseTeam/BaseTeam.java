package com.BloodBowl.BloodBowl.BaseTeam;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.BloodBowl.BloodBowl.BasePlayer.BasePlayer;

@Entity
public class BaseTeam {

	@Id
	@Column(name = "race")
	private String race;

	@Column(name = "reroll_cost")
	private int rerollCost;

	private boolean apothecary;

	private int category;

	@Column(name = "team_description")
	private String teamDescription;

	@OneToMany(mappedBy = "race")
	private Set<BasePlayer> basePlayer;

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public boolean isApothecary() {
		return apothecary;
	}

	public void setApothecary(boolean apothecary) {
		this.apothecary = apothecary;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public int getRerollCost() {
		return rerollCost;
	}

	public void setRerollCost(int rerollCost) {
		this.rerollCost = rerollCost;
	}

	public String getTeamDescription() {
		return teamDescription;
	}

	public void setTeamDescription(String teamDescription) {
		this.teamDescription = teamDescription;
	}

	public Set<BasePlayer> getBasePlayer() {
		return basePlayer;
	}

	public void setBasePlayer(Set<BasePlayer> basePlayer) {
		this.basePlayer = basePlayer;
	}

}
