package com.spm.spmbackend.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spm.spmbackend.model.Company;
import com.spm.spmbackend.repository.CompanyRepository;
import com.spm.spmbackend.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyRepository comprepo;
	
	@Override
	public List<Company> getCompany() {
		return comprepo.findAll();
	}

	@Override
	public Company addCompany(Company c) {
		System.out.println("this is impl"+c.getAddress());
		return comprepo.insert(c);
		
	}
	
}
