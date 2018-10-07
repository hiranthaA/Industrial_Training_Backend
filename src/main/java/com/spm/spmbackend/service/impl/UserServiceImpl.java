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
	public User resetPassword(User u) {
		return userepo.save(u);
	}

	@Override
	public User getUserByNameAndPassword(String username, String password) {
		return userepo.findOneByEmailAndPassword(username, password);
	}


	@Override
	public boolean deleteUser(String id) {
		Long res = userepo.deleteOneById(id);
		if(res==0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	@Override
	public User getUserByEmail(String email) {
		return userepo.findOneByEmail(email);
	}
	

	@Override
	public User updateUser(User u) {
		User current = userepo.findOneById(u.getId());
		current.setEmail(u.getEmail());
		return userepo.save(current);
	}

}
