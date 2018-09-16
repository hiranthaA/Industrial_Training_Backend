package com.spm.spmbackend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spm.spmbackend.model.Supervisor;

public interface SupervisorRepository extends MongoRepository<Supervisor,Integer>{

	Supervisor findOneByEmail(String email);

}
