package com.cognizant.deepak.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.deepak.entities.MatchFixing;
import com.cognizant.deepak.repository.MatchFixingRepository;

@Service
public class MatchFixingService {

	@Autowired
	private MatchFixingRepository matchFixingRepository;
	
//	set new match fixture
	public MatchFixing setMatchFixing(MatchFixing matchFixing) {
		return matchFixingRepository.save(matchFixing);
	}
	
//	get all match fixtures
	public List<MatchFixing>getAllMatchFixtures(){
		return matchFixingRepository.findAll();
	}
	
//delete match fixture by id
	public void deleteMatchFixing(int matchFixtureId) {
		 matchFixingRepository.deleteById(matchFixtureId);
	}
	
//	update player details
	public Optional<MatchFixing> findById(int id) {
		return matchFixingRepository.findById(id);
	}
	
	
	
}
