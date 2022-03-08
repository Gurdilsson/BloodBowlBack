package com.BloodBowl.BloodBowl.Team;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.BloodBowl.BloodBowl.Player.Player;

@Entity
public class Team {

	@Id
	@Column(name = "team_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int teamId;

	@Column(name = "team_name")
	private String teamName;

	private String race;

	private String stadium;

	private String sponsor;

	private String coach;

	@Column(name = "league_point")
	private String leaguePoint;

	private int fans;

	@Column(name = "coach_assistant")
	private int coachAssistants;

	private int cheerleader;

	private int apothecary;

	@Column(name = "actual_value")
	private int actualValue;

	@Column(name = "total_value")
	private int totalValue;

	@Column(name = "user_id")
	private int userId;

	@OneToMany(mappedBy = "teamId")
	private Set<Player> players;

	// ------------Getters and setters --------------------

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int id) {
		this.teamId = id;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String name) {
		this.teamName = name;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getStadium() {
		return stadium;
	}

	public void setStadium(String stadium) {
		this.stadium = stadium;
	}

	public String getSponsor() {
		return sponsor;
	}

	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}

	public String getCoach() {
		return coach;
	}

	public void setCoach(String coach) {
		this.coach = coach;
	}

	public String getLeaguePoint() {
		return leaguePoint;
	}

	public void setLeaguePoint(String leaguePoint) {
		this.leaguePoint = leaguePoint;
	}

	public int getFans() {
		return fans;
	}

	public void setFans(int fans) {
		this.fans = fans;
	}

	public int getCoachAssistants() {
		return coachAssistants;
	}

	public void setCoachAssistants(int coachAssistants) {
		this.coachAssistants = coachAssistants;
	}

	public int getCheerleader() {
		return cheerleader;
	}

	public void setCheerleader(int cheerleader) {
		this.cheerleader = cheerleader;
	}

	public int getApothecary() {
		return apothecary;
	}

	public void setApothecary(int apothecary) {
		this.apothecary = apothecary;
	}

	public int getActualValue() {
		return actualValue;
	}

	public void setActualValue(int actualValue) {
		this.actualValue = actualValue;
	}

	public int getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(int totalValue) {
		this.totalValue = totalValue;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Set<Player> getPlayers() {
		return players;
	}

	public void setPlayers(Set<Player> players) {
		this.players = players;
	}

}
