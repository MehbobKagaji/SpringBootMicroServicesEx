package com.training;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersMongoRepository extends MongoRepository<Users, Integer>{

	Users findByName(String name);
}
