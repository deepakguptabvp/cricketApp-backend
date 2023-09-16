package com.cognizant.deepak.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cognizant.deepak.entities.MapingContestFixture;

@Repository
public interface MapingContestFixtureRepository extends JpaRepository<MapingContestFixture, Integer>{

}
