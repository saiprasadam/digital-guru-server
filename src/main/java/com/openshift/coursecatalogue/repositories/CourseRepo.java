package com.openshift.coursecatalogue.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.openshift.coursecatalogue.model.Course;

/**
 * @author kaleembasha.akbar
 *
 * Course Repository File. Custom repository methods can be added
 */
@Repository
public class CourseRepo{
	
	@Autowired
	private MongoTemplate mongoTemplate;

	public List<Course> findAll(){
		return mongoTemplate.findAll(Course.class);
	};
	
	

}
