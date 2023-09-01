package com.cognizant.deepak.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "MatchFixing")
public class MatchFixing {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String teamA;
	private String teamB;
	private String venue;
//	@JsonFormat(pattern = "yyyy-MM-ddTHH:mm:ss")
	private LocalDateTime date;

	public MatchFixing() {
		super();
		// TODO Auto-generated constructor stub
	}
       
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "MatchFixing [id=" + id + ", teamA=" + teamA + ", teamB=" + teamB + ", venue=" + venue + ", date="
				+ date + "]";
	}

       

}
