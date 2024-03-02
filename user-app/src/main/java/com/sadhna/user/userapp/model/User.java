package com.sadhna.user.userapp.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "User")
public class User {
	
	private String username;
	private String role;
	
	
	public User() {
		
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}
	
	
	
	

}
