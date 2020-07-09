package com.openshift.coursecatalogue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.openshift.coursecatalogue.service.CourseService;

/**
 * @author kaleembasha.akbar
 *
 * Controller class for Course related stuffs.
 */
@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;

	@GetMapping(path="/get")
	public List getCourseLlist() {
		return courseService.findAll();
	}

}
