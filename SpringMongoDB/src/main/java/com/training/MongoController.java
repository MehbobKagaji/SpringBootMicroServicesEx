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
public class MongoController {
	@Autowired
	UsersMongoRepository mongoDB;
	
	
	
	@RequestMapping(value = "/all")
	public List<Users> findAll(){
		return mongoDB.findAll();
	}
	
	
	@RequestMapping(value = "/{name}")
	public Users findByname(@PathVariable final String name){
		return mongoDB.findByName(name);
	}
	
	@RequestMapping(value = "/delete/{id}")
	public void delete(@PathVariable final Integer id){
		mongoDB.deleteById(id);
	}
	
	@PostMapping(value = "/load")
	public Users load(@RequestBody final Users users){
		mongoDB.save(users);
		return mongoDB.findByName(users.getName());
	}
	
	

}
