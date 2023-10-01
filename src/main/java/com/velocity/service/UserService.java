package com.velocity.service;

import java.util.Optional;

import com.velocity.model.User;

public interface UserService {

	// get the user details based on id
	public User getUserById(Integer id) throws Exception;

	// update user details
	public User updateUser(User user);

}
