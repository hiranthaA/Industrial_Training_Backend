package com.spm.spmbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spm.spmbackend.model.User;
import com.spm.spmbackend.service.UserService;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService usservice;
	
	@RequestMapping(value="/addUser", method=RequestMethod.POST)
	public User addUser(@RequestBody User u) {
		return usservice.addUser(u);
	}
	
	@RequestMapping(value="/username/{name}/password/{pwd}", method=RequestMethod.GET)
	public User getUserByEmailAndPassword(@PathVariable("name") String username, @PathVariable("pwd") String password) {
		System.out.println(username+password);
		return usservice.getUserByNameAndPassword(username, password);
	}
	
	@RequestMapping(value="/updateUser", method=RequestMethod.POST)
	public User updateUser(@RequestBody User u) {
		return usservice.updateUser(u);
	}
	
	@RequestMapping(value="/deleteUser/{id}", method=RequestMethod.GET)
	public boolean deleteUser(@PathVariable("id") String id) {
		return usservice.deleteUser(id);
	}
	
	@RequestMapping(value="/getUser/{email}", method=RequestMethod.GET)
	public User getUserByEmail(@PathVariable("email") String email) {
		return usservice.getUserByEmail(email);
	}
	
	@RequestMapping(value="/resetPassword", method=RequestMethod.POST)
	public User resetPassword(@RequestBody User u) {
		return usservice.resetPassword(u);
	}
	
}
