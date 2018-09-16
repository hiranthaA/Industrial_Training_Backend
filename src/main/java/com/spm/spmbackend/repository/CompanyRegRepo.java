package com.spm.spmbackend.repository;

import org.springframework.stereotype.Repository;

import com.spm.spmbackend.model.CompanyReg;

import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface CompanyRegRepo extends MongoRepository<CompanyReg, String>{

}
