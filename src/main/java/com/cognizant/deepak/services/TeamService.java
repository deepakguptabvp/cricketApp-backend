package com.cognizant.deepak.services;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.deepak.entities.Team;
import com.cognizant.deepak.repository.TeamRepository;

@Service
public class TeamService {

	@Autowired
	private TeamRepository teamRepository;
	
	//set new team
	public Team setTeam(Team team) {
		return teamRepository.save(team);
	}

	//get all products
	public List<Team> getAllTeams() {
		return teamRepository.findAll();
	}
	
	//delete team
	public void deleteTeam(int teamId) {
		teamRepository.deleteById(teamId);
	}
	  
}   