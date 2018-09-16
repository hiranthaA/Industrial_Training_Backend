package com.spm.spmbackend.service;

import java.util.List;
import com.spm.spmbackend.model.Student;

public interface StudentService {

	List<Student> getall();
	Student addStudent(Student s);
}
