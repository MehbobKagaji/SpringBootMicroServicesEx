/**
 * 
 */
package com.training;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class JPAController {

	@Autowired
	private UserJpaRepository jpaRepo;
	
	@RequestMapping(value = "/all")
	public List<Users> findAll(){
		return jpaRepo.findAll();
	}
	
	
	@RequestMapping(value = "/{name}")
	public Users findByname(@PathVariable final String name){
		return jpaRepo.findByName(name);
	}
	
	@PostMapping(value = "/load")
	public Users load(@RequestBody final Users users){
		jpaRepo.save(users);
		return jpaRepo.findByName(users.getName());
	}
}
