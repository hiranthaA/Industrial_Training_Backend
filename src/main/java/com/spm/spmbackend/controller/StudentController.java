package com.spm.spmbackend.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.spm.spmbackend.model.Student;
import com.spm.spmbackend.service.StudentService;

@Controller
@RestController
@CrossOrigin
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="/getall", method = RequestMethod.GET)
	public List <Student> getall(){
		return studentService.getall();
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public Student addStudent(@RequestBody Student s) {
		System.out.println(s.getEmail());
		return studentService.addStudent(s);
		
		
	}

}
