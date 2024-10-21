package org.Railway.dao;

import java.util.List;

import org.Railway.entity.User;

public interface UserDao {

	User createUser(User user);

	List<User> getAllUsers();

	User getUser(int userid);

	User updateUser(int userid, User user);

	String deleteUser(int userid);
}