package com.spm.spmbackend.controller;

import java.util.List;

import com.spm.spmbackend.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spm.spmbackend.model.Form_i_1;
import com.spm.spmbackend.model.Form_i_3;
import com.spm.spmbackend.service.FormService;;

@RestController
@CrossOrigin
@RequestMapping("/forms")
public class FormController {
	
	@Autowired
	private FormService formservise;

	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="/formi1", method = RequestMethod.GET)
	public List<Form_i_1> getFormI1(){
			return  formservise.getFormi1();
	}
	
	@RequestMapping(value="/formi1", method=RequestMethod.POST)
	public Form_i_1 addFormI1(@RequestBody Form_i_1 c) {
		System.out.println(c.getStudentId());
		return formservise.addFormi1(c);
		//return c;
		
		
	}
	
	@RequestMapping(value="/formi1/{id}", method=RequestMethod.GET)
	public Form_i_1 getFormI1ByStudentID(@PathVariable("id") String id) {
		System.out.println(id);
		return  formservise.getFormi1ByStudentID(id);
		//return c;
		
		
	}
	@RequestMapping(value="/formi1/id/{id}", method=RequestMethod.GET)
	public Form_i_1 getFormI1ByFormId(@PathVariable("id") String id) {
		System.out.println(id);
		return  formservise.getFormI1ByFormId(id);
		//return c;
		
		
	}
	
	@RequestMapping(value="/formi1/supervisorEmail/{supID}/status/{status}", method=RequestMethod.GET)
	public List<Form_i_1> getFormI1BySupervisorAndFormStatus(@PathVariable("status") String status,@PathVariable("supID") String supID) {
		System.out.println(status+": "+ supID);
		return  formservise.getFormi1BystatusAndsupervisorEmail(status,supID);
		//return c;
		
		
	}
	@RequestMapping(value="/formi1/studentEmail/{stdEmail}", method=RequestMethod.GET)
	public Form_i_1 getFormI1ByStudentAndFormStatus(@PathVariable("stdEmail") String stdEmail) {
		System.out.println(": "+ stdEmail);
		return  formservise.getFormi1BystatusAndstudentEmail(stdEmail);
		//return c;
		
		
	}
	
	@RequestMapping(value="/formi1/status/{status}", method=RequestMethod.GET)
	public Form_i_1 getFormI1ByFormStatus(@PathVariable("status") String status){
		System.out.println(status);
		return  formservise.getFormi1ByStatus(status);
		//return c;
		
		
	}
	
	@RequestMapping(value="/formi1/id/{formid}", method=RequestMethod.PUT)
	public Form_i_1 updateFormI1ByFormStatus(@RequestBody Form_i_1 c, @PathVariable("formid") String formid){
		System.out.println(formid);
		return  formservise.updateFormi1ByFormid(formid,c);
		//return c;


	}
	
	
	@RequestMapping(value="/formi3", method = RequestMethod.GET)
	public List<Form_i_3> getFormI3(){
			return  formservise.getFormi3();
	}
	
	@RequestMapping(value="/formi3", method=RequestMethod.POST)
	public Form_i_3 addFormI3(@RequestBody Form_i_3 c) {
		System.out.println(c.getStudentId());
		return formservise.addFormi3(c);
		//return c;
		
		
	}

	@RequestMapping(value="/formi3/{id}", method=RequestMethod.GET)
	public Form_i_3 getFormI3ByStudentID(@PathVariable("id") String id) {
		System.out.println(id);
		return  formservise.getFormi3ByStudentID(id);
		//return c;


	}
	@RequestMapping(value="/formi3/id/{id}", method=RequestMethod.GET)
	public Form_i_3 getFormI3ByFormId(@PathVariable("id") String id) {
		System.out.println(id);
		return  formservise.getFormI3ByFormId(id);
		//return c;


	}

	@RequestMapping(value="/formi3/supervisorEmail/{supID}/status/{status}", method=RequestMethod.GET)
	public List<Form_i_3> getFormI3BySupervisorAndFormStatus(@PathVariable("status") String status,@PathVariable("supID") String supID) {
		System.out.println(status+": "+ supID);

		// setting student names
		List<Form_i_3> formList = formservise.getFormi3BystatusAndsupervisorEmail(status,supID);

		return formList ;
		//return c;


	}
	@RequestMapping(value="/formi3/studentEmail/{stdEmail}", method=RequestMethod.GET)
	public Form_i_3 getFormI3ByStudentAndFormStatus(@PathVariable("stdEmail") String stdEmail) {
		System.out.println(": "+ stdEmail);
		return  formservise.getFormi3BystatusAndstudentEmail(stdEmail);
		//return c;


	}

	@RequestMapping(value="/formi3/status/{status}", method=RequestMethod.GET)
	public Form_i_3 getFormI3ByFormStatus(@PathVariable("status") String status){
		System.out.println(status);
		return  formservise.getFormi3ByStatus(status);
		//return c;


	}

//	@RequestMapping(value="/formi3/id/{formid}", method=RequestMethod.PUT)
//	public Form_i_3 updateFormI3ByFormStatus(@RequestBody Form_i_3 c, @PathVariable("formid") String formid){
//		System.out.println(formid);
//		return  formservise.updateFormi3ByFormid(formid,c);
//		//return c;
//
//
//	}

	@RequestMapping(value="/formi3/update", method=RequestMethod.PUT)
	public Form_i_3 updateFormI3Status(@RequestBody Form_i_3 form){
		System.out.println(form);
		return  formservise.updateFormi3Status(form);
		//return c;

	}
	
	
	
	
	
}
