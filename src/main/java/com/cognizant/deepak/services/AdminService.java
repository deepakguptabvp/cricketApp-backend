package com.cognizant.deepak.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.deepak.entities.Admin;
import com.cognizant.deepak.repository.AdminRepository;

@Service
public class AdminService  extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private AdminRepository adminRepository;
	
	public Admin login(Admin admin) throws Exception{
		  Admin adminobj = adminRepository.findByEmail(admin.getEmail());
		  if (adminobj == null) {
			  throw new Exception("Admin not found. Kindly login again with valid credentials.");
		  } else if(adminobj != null && !(admin.getPassword().equals(adminobj.getPassword()))) {
			  throw new Exception("Password is invalid. Try again with correct password.");
		  }
		  return adminobj;
	}

}
