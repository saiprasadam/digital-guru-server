package com.openshift.coursecatalogue.repositories;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.openshift.coursecatalogue.model.Users;

/**
 * @author kaleembasha.akbar
 *
 * User Repository File. Custom repository methods can be added
 */
@Repository
public class UserRepo{
	private final Logger LOG = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	public List<Users> findAll(){
		return mongoTemplate.findAll(Users.class);
	}

	public Users findOne(String userid) {
		// TODO Auto-generated method stub
		Query query = new Query();
		query.addCriteria(Criteria.where("id").is(userid));
		return mongoTemplate.findOne(query,Users.class);
	}
	
	public Users findByName(String name) {
		Query query = new Query();
		query.addCriteria(Criteria.where("name").is(name));
		return mongoTemplate.findOne(query,Users.class);
	}
}
