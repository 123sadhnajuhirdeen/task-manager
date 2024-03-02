package com.sadhna.task.taskservice.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sadhna.task.taskservice.model.Task;

public interface TaskRepo extends MongoRepository<Task, String>{

}
