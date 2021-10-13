/*
 * Copyright @2021 Homedecor
 */
package com.homedecor.user.service;

import com.homedecor.user.exception.UserServiceException;
import com.homedecor.user.model.User;

/*
 * This user interface provides basic user operations. like add user, edit user etc..
 */
/**
 * @author kpanda
 *
 */
public interface UserService 
{
	
	/**
	 * To add user into User database
	 * 
	 * @param user
	 * @throws UserServiceException for any error while adding user
	 */
	void addUser(User user) throws UserServiceException;
	
	/**
	 * edit existing user
	 * 
	 * @param user
	 * @throws UserServiceException for any error while editing user
	 */
	void editUser(User user) throws UserServiceException;

}
