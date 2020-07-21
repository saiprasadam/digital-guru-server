package com.openshift.coursecatalogue.model;

import java.util.List;

public class UserwithCourse {
	
	private String ownerName;
	private String description;
	private String courseName;
	 private List<Filter> filters;
	
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public List<Filter> getFilters() {
		return filters;
	}
	public void setFilters(List<Filter> filters) {
		this.filters = filters;
	}
	public UserwithCourse(String ownerName, String description, String courseName, List<Filter> filters) {
		super();
		this.ownerName = ownerName;
		this.description = description;
		this.courseName = courseName;
		this.filters = filters;
	}
	
	
	

}
