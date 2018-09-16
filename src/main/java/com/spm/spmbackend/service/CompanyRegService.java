package com.spm.spmbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spm.spmbackend.model.CompanyReg;
import com.spm.spmbackend.repository.CompanyRegRepo;

@RestController

@CrossOrigin(origins = "http://localhost:8080/companyservice")
@RequestMapping("/company")
public class CompanyRegService {

	@Autowired
	private CompanyRegRepo repo;
	
	@RequestMapping(method = RequestMethod.GET, value="/getDetails")
	public List<CompanyReg> getCompany(){
		List lt = repo.findAll();
		return lt;
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/addCompany")
	public void addCompany(@RequestBody CompanyReg c) {
		String name = c.getCmpName();
		int cntct = c.getContact();
		String email = c.getEmail();
		int fax = c.getFax();
		String password = c.getPassword();
		String person = c.getPersonInCharge();
		
		CompanyReg reg = new CompanyReg();
		
		reg.setCmpName(name);
		reg.setContact(cntct);
		reg.setEmail(email);
		reg.setFax(fax);
		reg.setPassword(password);
		reg.setPersonInCharge(person);
		
		repo.save(reg);
		
	}
	
}
