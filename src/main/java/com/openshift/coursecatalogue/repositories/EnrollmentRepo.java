package com.openshift.coursecatalogue.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.openshift.coursecatalogue.model.Enrollment;

/**
 * @author kaleembasha.akbar
 *
 * Enrollment Repository File. Custom repository methods can be added
 */
@Repository
public class EnrollmentRepo{
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	public List<Enrollment> findAll(){
		return mongoTemplate.findAll(Enrollment.class);
	};

}
