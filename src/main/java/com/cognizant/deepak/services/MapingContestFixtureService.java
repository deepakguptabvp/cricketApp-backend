package com.cognizant.deepak.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.deepak.entities.CreateContest;
import com.cognizant.deepak.entities.MapingContestFixture;
import com.cognizant.deepak.entities.MatchFixing;
import com.cognizant.deepak.repository.MapingContestFixtureRepository;

@Service
public class MapingContestFixtureService {

	@Autowired
	private MapingContestFixtureRepository mapingContestFixtureRepository;

	@Autowired
	private CreateContestService createContestService;

	@Autowired
	private MatchFixingService matchFixingService;

//	public MapingContestFixture setMapingContestFixture(MapingContestFixture mapingContestFixture) {
//		return mapingContestFixtureRepository.save(mapingContestFixture);
//	}

//	set new mapping contest fixture
	public Object create(MapingContestFixture mapingContestFixture) {
		System.out.println("asdfasfd");
		// setting the contest name
		Optional<CreateContest> contest = createContestService.findById(mapingContestFixture.getContestId());
		CreateContest tempc = new CreateContest();
		if (contest.isPresent()) {
			tempc = contest.get();
			mapingContestFixture.setContestName(tempc.getName());
		}
		System.out.println(tempc.getName());

		// setting the match name
		Optional<MatchFixing> match = matchFixingService.findById(mapingContestFixture.getMatchId());
		MatchFixing tempmatch = new MatchFixing();
		if (match.isPresent()) {
			tempmatch = match.get();
			mapingContestFixture.setMatchName(tempmatch.getTeamA() + " vs " + tempmatch.getTeamB());
			mapingContestFixture.setTeamA(tempmatch.getTeamA());
			mapingContestFixture.setTeamB(tempmatch.getTeamB());
		}
		System.out.println("hellooooo");
		System.out.println(mapingContestFixture);
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
