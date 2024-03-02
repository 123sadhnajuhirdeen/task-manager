package com.sadhna.user.userapp.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sadhna.user.userapp.model.User;

public interface UserRepo extends MongoRepository<User, String>{

}
