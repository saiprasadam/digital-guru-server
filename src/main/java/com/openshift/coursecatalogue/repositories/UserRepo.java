package com.openshift.coursecatalogue.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.openshift.coursecatalogue.model.User;

/**
 * @author kaleembasha.akbar
 *
 * User Repository File. Custom repository methods can be added
 */
@Repository
public class UserRepo{
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	public List<User> findAll(){
		return mongoTemplate.findAll(User.class);
	};
	
}
