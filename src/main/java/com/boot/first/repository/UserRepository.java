package com.boot.first.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.boot.first.entity.User;

@Repository
public class UserRepository {
	private List<User> users = new ArrayList<User>();

	public User saveUser(User user) {
		this.users.add(user);
		return user;
	}

	public List<User> getUsers() {
		return this.users;
	}

}
