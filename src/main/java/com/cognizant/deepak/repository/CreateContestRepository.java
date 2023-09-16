package com.cognizant.deepak.repository;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;
import com.cognizant.deepak.entities.CreateContest;

@Repository
public interface CreateContestRepository extends JpaRepository<CreateContest, Integer> {

}
