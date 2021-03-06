package com.spm.spmbackend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spm.spmbackend.model.User;

public interface UserRepository extends MongoRepository<User,Integer> {
	User findOneByEmailAndPassword(String email, String password);
	User findOneById(String id);
	Long deleteOneById(String id);
	User findOneByEmail(String email);
}
