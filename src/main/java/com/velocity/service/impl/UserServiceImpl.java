package com.velocity.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.velocity.model.User;
import com.velocity.repository.UserRepository;
import com.velocity.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User getUserById(Integer id) throws Exception {
		User user = userRepository.findById(id);
		// user object is null
		if (user == null) {
			throw new Exception("User not Found");
		}
		return user;
	}

	@Override
	public User updateUser(User user) {
		User user1 = userRepository.save(user);
		return user1;
	}

}
