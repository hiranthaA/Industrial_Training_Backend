package com.spm.spmbackend.repository;

import org.springframework.stereotype.Repository;

import com.spm.spmbackend.model.Company;

import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface CompanyRepository extends MongoRepository<Company, String>{
	
}
