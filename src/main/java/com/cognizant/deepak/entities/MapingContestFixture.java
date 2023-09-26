package com.cognizant.deepak.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MapingContestFixture")
public class MapingContestFixture {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int matchId;
	private String matchName;
	private String teamA;
	private String teamB;   
	private int contestId;
	private String contestName;

	public MapingContestFixture() {
		super();
		// TODO Auto-generated constructor stub
	}  
  
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public int getMatchId() {
		return matchId;
	}

	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}

	public String getMatchName() {
		return matchName;
	}

	public void setMatchName(String matchName) {
		this.matchName = matchName;
	}

	public String getTeamA() {
		return teamA;
	}

	public void setTeamA(String teamA) {
		this.teamA = teamA;
	}

	public String getTeamB() {
		return teamB;
	}

	public void setTeamB(String teamB) {
		this.teamB = teamB;
	}

	public int getContestId() {
		return contestId;
	}

	public void setContestId(int contestId) {
		this.contestId = contestId;
	}

	public String getContestName() {
		return contestName;
	}

	public void setContestName(String contestName) {
		this.contestName = contestName;
	}

	@Override
	public String toString() {
		return "MapingContestFixture [matchId=" + matchId + ", matchName=" + matchName + ", teamA=" + teamA + ", teamB="
				+ teamB + ", contestId=" + contestId + ", contestName=" + contestName + "]";
	}

	
}
