package com.spm.spmbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spm.spmbackend.model.Company;
import com.spm.spmbackend.service.CompanyService;

@RestController
@CrossOrigin
@RequestMapping("/company")
public class CompanyController {
	
	@Autowired
	private CompanyService compservice;
	
	@RequestMapping(value="/getall", method = RequestMethod.GET)
	public List<Company> getCompany(){
			return  compservice.getCompany();
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public Company addCompany(@RequestBody Company c) {
		//System.out.println(c.getCmpId());
		System.out.println(c.getAddress());
		return compservice.addCompany(c);
		
	}
	
	@RequestMapping(value="/getcompany/{id}", method = RequestMethod.GET)
	public Company getCompanyByID(@PathVariable String id){
			return  compservice.getCompanyByID(id);
	}
	
	@RequestMapping(value="/testapi", method = RequestMethod.GET)
	public String test(){
			return  "hello, this is from company controller";
	}
	
}
