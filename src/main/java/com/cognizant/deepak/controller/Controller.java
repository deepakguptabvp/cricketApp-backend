package com.cognizant.deepak.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.deepak.entities.Admin;
import com.cognizant.deepak.entities.CreateContest;
import com.cognizant.deepak.entities.MatchFixing;
import com.cognizant.deepak.entities.Player;
import com.cognizant.deepak.entities.Team;
import com.cognizant.deepak.entities.User;
import com.cognizant.deepak.services.AdminService;
import com.cognizant.deepak.services.CreateContestService;
import com.cognizant.deepak.services.MatchFixingService;
import com.cognizant.deepak.services.PlayerService;
import com.cognizant.deepak.services.TeamService;
import com.cognizant.deepak.services.UserService;

@CrossOrigin("http://localhost:4200")
@RestController

public class Controller {

	@Autowired
	private UserService userService;

	@Autowired
	private AdminService adminService;

	@Autowired
	private TeamService teamService;

	@Autowired
	private PlayerService playerService;

	@Autowired
	private MatchFixingService matchFixingService;
	
	@Autowired
	private CreateContestService createContestService;

	@PostMapping("/cricket-app/user/registration")
	public ResponseEntity<User> addUser(@RequestBody @Validated User user) {
		return new ResponseEntity<>(userService.setUser(user), HttpStatus.CREATED);
	}

	@PostMapping("/cricket-app/user/login")
	public ResponseEntity<User> loginUser(@RequestBody @Validated User user) throws Exception {
		return new ResponseEntity<User>(userService.login(user), HttpStatus.OK);
	}

	@PostMapping("/cricket-app/admin/login")
	public ResponseEntity<Admin> adminLogin(@RequestBody @Validated Admin admin) throws Exception {
		return new ResponseEntity<Admin>(adminService.login(admin), HttpStatus.OK);
	}

//-----------------------------------------------Team Api's-----------------------------------------------------------	

	@PostMapping("/cricket-app/team/addteam")
	public ResponseEntity<Team> addTeam(@RequestBody @Validated Team team) {
		return new ResponseEntity<>(teamService.setTeam(team), HttpStatus.CREATED);
	}

	@GetMapping("/cricket-app/team/fetchallteams")
	public ResponseEntity<List<Team>> allTeams() {
//	System.out.println(teamService.getAllProducts());
		return new ResponseEntity<List<Team>>(teamService.getAllTeams(), HttpStatus.OK);
	}

	@DeleteMapping("/cricket-app/team/delete/{teamId}")
	public void deleteTeamById(@PathVariable int teamId) {
		teamService.deleteTeam(teamId);
	}

//------------------------------------------Player Api's---------------------------------------------------------------

	@PostMapping("/cricket-app/player/addplayer")
	public ResponseEntity<Player> addPlayer(@RequestBody @Validated Player player) {
		System.out.println("playerrrrrrrrr");
		return new ResponseEntity<>(playerService.setPlayer(player), HttpStatus.CREATED);
	}

	@GetMapping("/cricket-app/player/fetchallplayer")
	public ResponseEntity<List<Player>> allPlayers() {
		return new ResponseEntity<List<Player>>(playerService.getAllPlayers(), HttpStatus.OK);
	}    

	@DeleteMapping("/cricket-app/player/delete/{playerId}")
	public void deletePlayerById(@PathVariable @Validated int playerId) {
		playerService.deletePlayer(playerId);
	}

	@PutMapping("/cricket-app/player/update/{playerId}")
	public ResponseEntity<Player> updatePlayer(@RequestBody Player player, @PathVariable("playerId") int id) {
		Optional<Player> optionalPlayer = playerService.findById(id);

		if (!optionalPlayer.isPresent()) {
			return ResponseEntity.notFound().build();
		} else {
			player.setId(id);
			player = playerService.setPlayer(player);
			return ResponseEntity.ok(player);
		}
	}

//-------------------------------Match Fixing Api's----------------------------------------------------------------------------

	@PostMapping("/cricket-app/matchfixing/add-matchfixtures")
	public ResponseEntity<MatchFixing> addMatchFixture(@RequestBody @Validated MatchFixing matchFixing) {
		return new ResponseEntity<>(matchFixingService.setMatchFixing(matchFixing), HttpStatus.CREATED);
	}
	
	@GetMapping("/cricket-app/matchfixing/fetchall-matchfixtures")
	public ResponseEntity<List<MatchFixing>> fetchAllMatchFixtures(){
		return new ResponseEntity<List<MatchFixing>>(matchFixingService.getAllMatchFixtures(),HttpStatus.OK);
	}
	
	@DeleteMapping("/cricket-app/matchfixing/delete-matchfixtures/{matchFixtureId}")
	public void deleteMatchFixingById(@PathVariable @Validated int matchFixtureId) {
		matchFixingService.deleteMatchFixing(matchFixtureId);
	}
	
	@PutMapping("/cricket-app/matchfixing/update/{matchFixingId}")
	public ResponseEntity<MatchFixing> updateMatchFixing(@RequestBody MatchFixing matchFixing, @PathVariable ("matchFixingId") int id){
		Optional<MatchFixing> optionalMatchFixing = matchFixingService.findById(id);
		
		if (!optionalMatchFixing.isPresent()) {
			return ResponseEntity.notFound().build();
		} else {
			matchFixing.setId(id);
			matchFixing = matchFixingService.setMatchFixing(matchFixing);
			return ResponseEntity.ok(matchFixing);
		}
	}
	
//-------------------------------Create Contest Api's----------------------------------------------------------------------------	

	@PostMapping("/cricket-app/createcontest/add-createcontest")
	public ResponseEntity<CreateContest> addContest(@RequestBody @Validated CreateContest createContest){
		return new ResponseEntity<>(createContestService.setCreateContest(createContest),HttpStatus.CREATED);
	}
	
	@PutMapping("/cricket-app/createcontest/fetchall-createcontest")
	public ResponseEntity<List<CreateContest>>fetchAllCreateContest(){
		return new ResponseEntity<List<CreateContest>>(createContestService.getAllCreateContest(),HttpStatus.OK);
	}
	
	@DeleteMapping("cricket-app/createcontest/delete-createcontest/{createContestId}")
		public void deleteCreateContestById(@PathVariable @Validated int createContestId ) {
		createContestService.deleteCreateContest(createContestId);
	}
	
	
	
}
