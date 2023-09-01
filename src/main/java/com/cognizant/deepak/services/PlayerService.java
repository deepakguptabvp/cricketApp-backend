package com.cognizant.deepak.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cognizant.deepak.entities.Player;
import com.cognizant.deepak.repository.PlayerRepository;

@Service
public class PlayerService {
	
	@Autowired
	private PlayerRepository playerRepository;

	// set new Player
	public Player setPlayer(Player player) {
		return playerRepository.save(player);
	}

	// fetch all players
	public List<Player> getAllPlayers() {
		return playerRepository.findAll();
	}

	// delete player by Id
	public void deletePlayer(int playerId) {
		playerRepository.deleteById(playerId);
	} 
	   
//	update player details
	public Optional<Player> findById(int id) {
		return playerRepository.findById(id);
	}

}   

