package com.openshift.coursecatalogue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openshift.coursecatalogue.model.User;
import com.openshift.coursecatalogue.repositories.UserRepo;
/**
 * @author kaleembasha.akbar
 *
 * Service class for User/Groups related stuffs.
 */
@Service
public class UserService {
	@Autowired
	private UserRepo userRepo;

	
	public List<User> findAll(){
		return userRepo.findAll();
	}

}
