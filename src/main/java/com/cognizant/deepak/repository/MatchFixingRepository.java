package com.cognizant.deepak.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.deepak.entities.MatchFixing;

@Repository
public interface MatchFixingRepository extends JpaRepository<MatchFixing, Integer>{

	
}
