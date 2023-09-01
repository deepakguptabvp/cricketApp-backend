package com.cognizant.deepak.entities;

import javax.persistence.Entity; 
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Player")
public class Player {   

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String player_name;
	private String team_name;
	private String player_skills;
	private int player_points;

	public Player() {
		super();
	}
  
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getplayer_name() {
		return player_name;
	}

	public void setplayer_name(String player_name) {
		this.player_name = player_name;
	}

	public String getteam_name() {
		return team_name;
	}

	public void setteam_name(String team_name) {
		this.team_name = team_name;
	}

	public String getplayer_skills() {
		return player_skills;
	}

	public void setplayer_skills(String player_skills) {
		this.player_skills = player_skills;
	}

	public int getplayer_points() {
		return player_points;
	}

	public void setplayer_points(int player_points) {
		this.player_points = player_points;
	}

	@Override
	public String toString() {
		return "Players [id=" + id + ", player_name=" + player_name + ", team_name=" + team_name + ", player_skills="
				+ player_skills + ", player_points=" + player_points + "]";
	}

	
	

}
