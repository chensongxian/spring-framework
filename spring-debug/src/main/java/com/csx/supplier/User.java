package com.csx.supplier;

/**
 * @Description: TODO
 * @author: lucachen
 * @Date: 2021-04-24
 */
public class User {

	private String username;

	public User() {
	}

	public User(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "User{" +
				"username='" + username + '\'' +
				'}';
	}
}
