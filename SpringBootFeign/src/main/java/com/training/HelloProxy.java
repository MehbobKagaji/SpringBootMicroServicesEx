package com.training;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController	
@FeignClient(name="student-service")
public interface HelloProxy {
	
	@RequestMapping(value="/getStudentDetailsForSchool/{schoolname}", method = RequestMethod.GET)
	public List getMsgg(@PathVariable("schoolname") String schoolname);

}
