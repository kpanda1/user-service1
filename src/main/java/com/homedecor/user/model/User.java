/*
 * Copyright @2021 Homedecor
 */
package com.homedecor.user.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author kpanda
 *
 */
@Entity
public class User {

	/**
	 * default constructor
	 */
	public User() {
	}

	/**
	 * parameterized constructor
	 * 
	 * @param userName
	 * @param userId
	 */
	public User(String userName, Long userId) {
		super();
		this.userName = userName;
		this.userId = userId;
	}

	/**
	 * user name
	 */
	private String userName;

	/**
	 * user Id
	 */
	@Id
	@GeneratedValue
	private Long userId;

	/**
	 * @return
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "User{" + "id=" + this.userId + ", name='" + this.userName + '\'' + '}';
	}
}
