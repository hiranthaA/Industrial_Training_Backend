package com.spm.spmbackend.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spm.spmbackend.model.Student;
import com.spm.spmbackend.repository.StudentRepository;
import com.spm.spmbackend.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentrepo;
	
	@Override
	public List<Student> getall() {
		return studentrepo.findAll();
	}

	@Override
	public Student addStudent(Student s) {
		System.out.println("this is impl"+s.getAddress());
		Student r = studentrepo.insert(s);
		System.out.println(r.getId());
		return r;
	}
	
	@Override
	public Student getStudentByEmail(String email) {
		return studentrepo.findOneByEmail(email);
	}
	
	@Override
	public Student updateStudent(String email,Student s) {
		Student current=studentrepo.findOneByEmail(email);
		current.setStudentName(s.getStudentName());
		current.setAddress(s.getAddress());
		current.setItNo(s.getItNo());
		current.setHomeNo(s.getHomeNo());
		current.setMobileNo(s.getMobileNo());
		return studentrepo.save(current);
	}

}
