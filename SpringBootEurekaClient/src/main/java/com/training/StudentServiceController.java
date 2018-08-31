package com.training;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentServiceController {

	private static Map<String , List<Student>> schoolDB = null;
	
	static {
		
		schoolDB = new HashMap<String, List<Student>>();
		List<Student> lst = new ArrayList<Student>();
		Student std = new Student("Mehboob", "Class 1");
		lst.add(std);
		std = new Student("MAX", "Class X");
		lst.add(std);
		
		schoolDB.put("abcschool", lst);
		
		lst = new ArrayList<Student>();
		std = new Student("MMM", "Class 2");
		lst.add(std);
		std = new Student("XXX", "Class 4");
		lst.add(std);
		
		schoolDB.put("XYZSchool", lst);
		
	}
	
	
	@RequestMapping(value = "/getStudentDetailsForSchool/{schoolname}", method = RequestMethod.GET)
	public List<Student> getStudents(@PathVariable String schoolname) {
		
		System.out.println("Getting Student details for " + schoolname);
		
		List<Student> studentlist = schoolDB.get(schoolname);
		if(studentlist==null){
			studentlist = new ArrayList<Student>();
			Student std = new Student("Not Found!", "N/A");
			studentlist.add(std);
		}
		return studentlist;
	}
}
