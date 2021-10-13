/*
 * Copyright @2021 Homedecor
 */
package com.homedecor.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.homedecor.user.model.User;

/**
 * user repository that holds user records
 * @author kpanda
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
}
