package com.cognizant.deepak.services;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;

import com.cognizant.deepak.entities.User;
import com.cognizant.deepak.repository.UserRepository;

@Service
public class UserService extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private UserRepository userRepository;

	// set new User
	public User setUser(User user) {
		return userRepository.save(user);
	}

	// login existing User
	public User login(User user) throws Exception {
		User userObj = userRepository.findByEmail(user.getEmail());
		if (userObj == null) {
			throw new Exception("User Not Found ! Kindly register.");
		} else if (userObj != null && !(user.getPassword().equals(userObj.getPassword()))) {
			throw new Exception("Password is invalid. Try with correct password.");
		}
		return userObj;
	}

}
