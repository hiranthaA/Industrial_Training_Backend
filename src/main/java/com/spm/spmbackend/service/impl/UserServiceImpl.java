package com.spm.spmbackend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spm.spmbackend.model.User;
import com.spm.spmbackend.repository.UserRepository;
import com.spm.spmbackend.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userepo;
	
	@Override
	public User addUser(User u) {
		return userepo.insert(u);
	}

	@Override
	public User getUserByNameAndPassword(String username, String password) {
		return userepo.findOneByEmailAndPassword(username, password);
	}

}
