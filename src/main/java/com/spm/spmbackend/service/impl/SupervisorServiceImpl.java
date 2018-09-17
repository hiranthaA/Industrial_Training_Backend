package com.spm.spmbackend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spm.spmbackend.model.Supervisor;
import com.spm.spmbackend.repository.SupervisorRepository;
import com.spm.spmbackend.service.SupervisorService;

@Service
public class SupervisorServiceImpl implements SupervisorService {

	@Autowired
	private SupervisorRepository superrepo;
	
	@Override
	public List<Supervisor> getall() {
		return superrepo.findAll();
	}

	@Override
	public Supervisor addSupervisor(Supervisor s) {
		return superrepo.save(s);
	}

	@Override
	public Supervisor getSupervisorByEmail(String email) {
		return superrepo.findOneByEmail(email);
	}

	@Override
	public List<Supervisor> getSupervisorByCompany(String company) {
		return superrepo.findAllByCompanyid(company);
	}

	@Override
	public Supervisor getSupervisorById(String id) {
		return superrepo.findOneById(id);
	}
	
}
