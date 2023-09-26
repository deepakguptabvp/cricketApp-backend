package com.cognizant.deepak.gaminginfo;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class GameRules {

	@Autowired
	private Environment environment;

	public String getBattingPointsRun() {
		return environment.getProperty("pointsystem.battingpoints.runs");
	}

	public String getBattingBoundaryPoints() {
		return environment.getProperty("pointsystem.battingpoints.boundary");
	}
	public String getBowlingPointsWicket() {
		return environment.getProperty("pointsystem.bowlingpoints.wicket");
	}

	public String getBowlingPointsBoundary() {
		return environment.getProperty("pointsystem.bowlingpoints.boundary");
	}

	public String getFieldingpointsBoundary() {
		return environment.getProperty("pointsystem.fieldingpoints.boundary");
	}

	public String getOtherPointsCaption() {
		return environment.getProperty("pointsystem.otherpoints.captain");
	}
}
