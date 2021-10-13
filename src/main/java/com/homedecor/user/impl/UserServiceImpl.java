/*
 * Copyright @2021 Homedecor
 */
package com.homedecor.user.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homedecor.user.dao.UserRepository;
import com.homedecor.user.exception.UserServiceException;
import com.homedecor.user.model.User;
import com.homedecor.user.service.UserService;

/**
 * @author kpanda
 *
 */
@Service
public class UserServiceImpl implements UserService {

	private static Logger log = Logger.getLogger(UserServiceImpl.class.getName());

	@Autowired
	private UserRepository repository;

	@Override
	public void addUser(User user) throws UserServiceException {

		if (log.isDebugEnabled()) {
			log.debug("UserServiceImpl:addUser");
		}

		repository.save(user);
	}

	@Override
	public void editUser(User user) throws UserServiceException {
		if (log.isDebugEnabled()) {
			log.debug("UserServiceImpl:editUser");
		}

	}

}
