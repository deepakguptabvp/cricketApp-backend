package com.cognizant.deepak.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.deepak.entities.CreateContest;
import com.cognizant.deepak.repository.CreateContestRepository;

@Service
public class CreateContestService {

	@Autowired
	private CreateContestRepository createContestRepository;
	
//	set new create contest
	public CreateContest setCreateContest(CreateContest createContest) {
		return createContestRepository.save(createContest);
	}
	
// 	fetch all create contest 
	public List<CreateContest>getAllCreateContest(){
		return createContestRepository.findAll();
	}
	
//	delete create contest by id 
	public void deleteCreateContest(int createContestId) {
		createContestRepository.deleteById(createContestId);
	}
	
}
