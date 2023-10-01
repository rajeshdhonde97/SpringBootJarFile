package com.velocity.restcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.User;
import com.velocity.service.UserService;

@RestController
public class UserRestController {

	// inject the userService reference into UserRestController
	@Autowired
	private UserService userService;

	@GetMapping("/updatePasswords/{id}")
	public Boolean updatePasswords(@PathVariable("id") Integer id, @RequestParam("password") String password)
			throws Exception {
		// call get user details here
		User user = userService.getUserById(id);
		if (user != null) {
			// we have set the value into user object
			user.setPassword(password);
			// update the user details
			userService.updateUser(user);
			return true;
		}
		return false;
	}

}
