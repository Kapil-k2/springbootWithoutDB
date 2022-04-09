package com.boot.first.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.first.repository.*;
import com.boot.first.entity.User;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@PostMapping(value = "/saveUser", consumes = MediaType.APPLICATION_JSON_VALUE)
	public User saveUser(@RequestBody User user) {
		userRepository.saveUser(user);
		return user;
	}

	@GetMapping("/getUsers")
	public List<User> getUsers() {
		List<User> users = userRepository.getUsers();
		return users;
	}

}
