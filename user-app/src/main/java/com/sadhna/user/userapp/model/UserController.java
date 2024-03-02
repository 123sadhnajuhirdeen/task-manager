package com.sadhna.user.userapp.model;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sadhna.user.userapp.repo.UserRepo;

public class UserController {

	@Autowired
	UserRepo userRepo;

	@GetMapping("/all")
	public List<User> getAllUser() {
		return userRepo.findAll();
	}

	@GetMapping("/read{id}")
	public User readUser(@PathVariable String id) {
		Optional<User> user = userRepo.findById(id);
		return user.get();
	}

}
