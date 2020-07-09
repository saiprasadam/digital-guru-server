package com.openshift.coursecatalogue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openshift.coursecatalogue.model.Course;
import com.openshift.coursecatalogue.repositories.CourseRepo;

/**
 * @author kaleembasha.akbar
 *
 * Service class for Course related stuffs.
 */
@Service
public class CourseService {
	
	@Autowired
	private CourseRepo courseRepo;

	
	public List<Course> findAll(){
		return courseRepo.findAll();
	}
}
