package com.openshift.coursecatalogue.controller;

import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.Media;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.openshift.coursecatalogue.model.Courses;
import com.openshift.coursecatalogue.model.Filter;
import com.openshift.coursecatalogue.model.Users;
import com.openshift.coursecatalogue.model.UserwithCourse;
import com.openshift.coursecatalogue.service.CourseService;
import com.openshift.coursecatalogue.service.UserService;

/**
 * @author kaleembasha.akbar
 *
 * Controller class for Course related stuffs.
 */
@RestController
public class CourseController {
	private final Logger LOG = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private CourseService courseService;
	

	@Autowired
	private UserService userService;

	@GetMapping(path="/get")
	public List getCourseLlist() {
		return courseService.findAll();
	}
	
	@RequestMapping(value = "course/{courseId}", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<String> getUser(@PathVariable String courseId) {
		List <String> usercourse=new ArrayList<>();
		LOG.info("Getting users of valu of id" +courseId);
	Courses course=courseService.findOne(courseId);
	Users users= userService.findOne(course.getOwner().toString());
	LOG.info("Getting users of valu" +users.getEmail()+users.getName());
	usercourse.add(course.getName());
	usercourse.add(users.getName());
	usercourse.add(users.getEmail());
	usercourse.add(course.getDescription());
	
		return usercourse;
	}

	@GetMapping(path = "/getAllCourses")
	public List<UserwithCourse> getCourses() {
		List<UserwithCourse> usercourse = new ArrayList<>();
		List<Courses> course = courseService.findAll();
		course.stream().forEach(action -> {

			String owner = action.getOwner();
			String name = action.getName();
			String desc = action.getDescription();
			List<Filter> filt = action.getFilters();
			Users users = userService.findOne(owner);
			LOG.info("Getting users of value " + users.getName());
			UserwithCourse user = new UserwithCourse(users.getName(), desc, name, filt);
			usercourse.add(user);
		});
		return usercourse;
	}

}
