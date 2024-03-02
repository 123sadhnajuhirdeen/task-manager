package com.sadhna.user.userapp.taskuser;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface UserTaskRepo extends MongoRepository<UserTask, String> {
	
	@Query("{email :?0}")
	UserTask findByEmail(String email);

}
