package com.spm.spmbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spm.spmbackend.model.Form_i_1;
import com.spm.spmbackend.model.Supervisor;
import com.spm.spmbackend.service.SupervisorService;

@RestController
@CrossOrigin
@RequestMapping("/supervisor")
public class SupervisorController {
	
	@Autowired
	private SupervisorService superservice;
	
	@RequestMapping(value="/getall", method=RequestMethod.GET)
	public List<Supervisor> getSupervisors() {
		return superservice.getall();
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public Supervisor addSupervisor(@RequestBody Supervisor s) {
		return superservice.addSupervisor(s);
	}
	
	
	@RequestMapping(value="/get/{email}", method=RequestMethod.GET)
	public Supervisor getSupervisorByEmail(@PathVariable("email") String email) {
		System.out.println(email);
		return  superservice.getSupervisorByEmail(email);
		//return c;
	}
	
	@RequestMapping(value="/getsupervisors/{company}", method=RequestMethod.GET)
	public List<Supervisor> getSupervisorsByCompany(@PathVariable("company") String company) {
		return  superservice.getSupervisorByCompany(company);
	}
	
	@RequestMapping(value="/getsupervisor/{id}", method=RequestMethod.GET)
	public Supervisor getSupervisorById(@PathVariable("id") String id) {
		return  superservice.getSupervisorById(id);
	}

	@RequestMapping(value="/deletesupervisor/{id}", method=RequestMethod.GET)
	public boolean finddeleteSupervisor(@PathVariable("id") String id) {
		System.out.println(id);
		return  superservice.finddeleteSupervisor(id);
	}
}