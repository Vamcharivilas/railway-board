package org.Railway.service;

import java.util.List;

import org.Railway.entity.User;

public interface UserService {

	User createUser(User user);

	List<User> getAllUsers();

	User getUser(int uid);

	User updateUser(int userid, User user);

	String deleteUser(int userid);
}
