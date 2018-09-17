package com.spm.spmbackend.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spm.spmbackend.model.Supervisor;

public interface SupervisorRepository extends MongoRepository<Supervisor,Integer>{

	Supervisor findOneByEmail(String email);
	List<Supervisor> findAllByCompanyid(String company);
	Supervisor findOneById(String id);

}
