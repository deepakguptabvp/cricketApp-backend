package com.cognizant.deepak.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.deepak.entities.MapingContestFixture;
import com.cognizant.deepak.repository.MapingContestFixtureRepository;

@Service
public class MapingContestFixtureService {
	
	@Autowired
	private MapingContestFixtureRepository mapingContestFixtureRepository;

		
//	set new mapping contest fixture
	public MapingContestFixture setMapingContestFixture(MapingContestFixture mapingContestFixture) {
		return mapingContestFixtureRepository.save(mapingContestFixture);
	}

// 	fetch all mapping contest fixture 
	public List<MapingContestFixture> getAllMapingContestFixture() {
		return mapingContestFixtureRepository.findAll();
	}

//	delete mapping contest fixture by id 
	public void deleteMapingContestFixture(int mapingContestFixtureId) {
		mapingContestFixtureRepository.deleteById(mapingContestFixtureId);
	}


}          
