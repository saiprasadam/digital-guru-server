package com.openshift.coursecatalogue.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openshift.coursecatalogue.model.Courses;
import com.openshift.coursecatalogue.repositories.CourseRepo;

/**
 * @author kaleembasha.akbar
 *
 * Service class for Course related stuffs.
 */
@Service
public class CourseService {
	private final Logger LOG = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private CourseRepo courseRepo;

	
	public List<Courses> findAll(){
		return courseRepo.findAll();
	}


	public Courses findOne(String courseId) {
		// TODO Auto-generated method stub
		return courseRepo.findOne(courseId);
	}
}
