package com.spm.spmbackend.service;

import com.spm.spmbackend.model.User;

public interface UserService {
	
	public User addUser(User u);
	public User getUserByNameAndPassword(String email, String password);
}
