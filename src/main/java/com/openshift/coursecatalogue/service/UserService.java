package com.openshift.coursecatalogue.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openshift.coursecatalogue.model.Users;
import com.openshift.coursecatalogue.repositories.UserRepo;
/**
 * @author kaleembasha.akbar
 *
 * Service class for User/Groups related stuffs.
 */
@Service
public class UserService {
	private final Logger LOG = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private UserRepo userRepo;

	
	public List<Users> findAll(){
		return userRepo.findAll();
	}
	
	public Users findOne(String owner) {
		// TODO Auto-generated method stub
		return userRepo.findOne(owner);
	}
}
