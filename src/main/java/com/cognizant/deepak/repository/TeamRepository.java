package com.cognizant.deepak.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cognizant.deepak.entities.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {

}
