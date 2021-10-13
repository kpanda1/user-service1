/*
 * Copyright @2021 Homedecor
 */
package com.homedecor.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.homedecor.user.exception.UserServiceException;
import com.homedecor.user.model.User;
import com.homedecor.user.service.UserService;

/*
 * This controller class handles all the request come to User service.
 */
/**
 * @author kpanda
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	/**
	 * Add user endpoint
	 * 
	 * @throws UserServiceException
	 */
	@PostMapping(value = "/adduser", consumes = "application/json")
	public void addUser(@RequestBody User user) throws UserServiceException {
		userService.addUser(user);
	}

	/**
	 * Edit user endpoint
	 * 
	 * @param user
	 * @throws UserServiceException
	 */
	@PutMapping(value = "/edituser", consumes = "application/json")
	public void editUser(@RequestBody User user) throws UserServiceException {
		userService.editUser(user);
	}

	/**
	 * Edit user endpoint
	 * 
	 * @param user
	 * @throws UserServiceException
	 *//*
		 * @GetMapping(value = "/getuser") public void getUser() throws
		 * UserServiceException { userService.addUser(); }
		 * 
		 * @GetMapping(path="/all") public @ResponseBody Iterable<User> getAllUsers() {
		 * // This returns a JSON or XML with the users return repository.findAll(); }
		 */
}
