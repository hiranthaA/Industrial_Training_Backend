package com.spm.spmbackend.service;

import com.spm.spmbackend.model.User;

public interface UserService {
	
	public User addUser(User u);
	public User getUserByNameAndPassword(String email, String password);
	User updateUser(User u);
	boolean deleteUser(String id);
	User getUserByEmail(String email);
	User resetPassword(User u);
}
