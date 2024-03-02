package com.sadhna.user.userapp.taskuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserTaskController {
	
	@Autowired
	UserTaskRepo userTaskRepo;
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@PostMapping(value = "/signup")
	public ResponseEntity<String> createUser(@RequestBody UserTask userTask)
	{
		UserTask newUser = new UserTask();
		newUser.setEmail(userTask.getEmail());
		newUser.setPassword(passwordEncoder.encode(userTask.getPassword()));
		
		userTaskRepo.save(newUser);
		return new ResponseEntity<>("User Registration Sucess", HttpStatus.OK);
	}
	
	@PostMapping(value = "/signing")
	public ResponseEntity<String> signing(@RequestBody LoginRequest loginRequest)
	{
		String email = loginRequest.getEmail();
		String password = loginRequest.getPassword();
		UserTask user = userTaskRepo.findByEmail(email);
		
		if(user == null)
		{
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
	                  .body("Invalid email or password");
		}
		if(!passwordEncoder.matches(password, user.getPassword())) {
			
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
	                  .body("Invalid email or password");
			
		}
		
		return ResponseEntity.ok("Login successfull!!!");
		
	}

}
