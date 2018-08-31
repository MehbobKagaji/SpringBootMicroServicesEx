package com.training;

public class Student {
	
	private String name;
	private String SchoolName;
	
	
	public Student(String name, String schoolName) {
		super();
		this.name = name;
		SchoolName = schoolName;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchoolName() {
		return SchoolName;
	}
	public void setSchoolName(String schoolName) {
		SchoolName = schoolName;
	}
	
	

}
