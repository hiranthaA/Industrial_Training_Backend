package com.spm.spmbackend.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;
import com.spm.spmbackend.model.Form_i_1;
import com.spm.spmbackend.repository.Form_i_1Repo;
import com.spm.spmbackend.model.Form_i_3;
import com.spm.spmbackend.repository.Form_i_3Repo;
import com.spm.spmbackend.service.FormService;

@Service
public class FormServiceImpl implements FormService {

	@Autowired
	private Form_i_1Repo formi1Repo;
	
	@Autowired
	private Form_i_3Repo formi3Repo;
	
	@Override
	public List<Form_i_1> getFormi1() {
		return formi1Repo.findAll();
	}

	@Override
	public Form_i_1 addFormi1(Form_i_1 c) {
		System.out.println("this is impl"+c.getStudentId());
		Form_i_1 exists =  formi1Repo.findOneByStudentEmail(c.getStudentEmail());
		if(exists!=null){
			exists.setCgpa(c.getCgpa());
			exists.setSemester(c.getSemester());
			exists.setStudentName(c.getStudentName());
			exists.setStudentAddress(c.getStudentAddress());
			exists.setStudentMobilePhone(c.getStudentMobilePhone());
			exists.setStudentHomePhone(c.getStudentHomePhone());
			exists.setSupervisorEmail(c.getSupervisorEmail());
			exists.setYear(c.getYear());
			exists.setStudentId(c.getStudentId());
			c=exists;
		}
		return formi1Repo.save(c);
		
	}
	;

	@Override
	public Form_i_1 getFormI1ByFormId(String id) {
		return formi1Repo.findOneByFormId(id);
	}

	@Override
	public Form_i_1 getFormi1ByStudentID(String studentID) {
		return formi1Repo.findOneBystudentId(studentID);
	}

	@Override
	public List<Form_i_1> getFormi1BystatusAndsupervisorEmail(String status, String supervisorEmail) {
		return formi1Repo.findAllByStatusAndSupervisorEmail(status, supervisorEmail);
	}
	

	@Override
	public Form_i_1 getFormi1ByStatus(String status) {
		return formi1Repo.findOneByStatus(status);
	}

	@Override
	public Form_i_1 updateFormi1ByFormid(String formid, Form_i_1 c) {

		Form_i_1 o =  formi1Repo.findOneByFormId(formid);
		if(o!=null) {
			System.out.println(
					o.getStatus() +"\n"
					+o.getFormId() +"\n"
					+o.getStudentId() +"\n"
					+o.getStudentName() +"\n"
					+o.getStudentAddress() +"\n"
					+o.getStudentHomePhone() +"\n"
			);
			c.setFormId(formid);

			Update update = new Update();
			update.set("age", 100);

			c.setStatus("COMPLETED");
			c.setStudentId(o.getStudentId());
			c.setStudentName(o.getStudentName());
			c.setStudentAddress(o.getStudentAddress());
			c.setStudentHomePhone(o.getStudentHomePhone());
			c.setStudentMobilePhone(o.getStudentMobilePhone());
			c.setStudentEmail(o.getStudentEmail());
			c.setSemester(o.getSemester());
			c.setYear(o.getYear());
			c.setCgpa(o.getCgpa());

			formi1Repo.save(c);

			return c;
		}else {
			return o;
		}
	}

	@Override
	public Form_i_1 getFormi1BystatusAndstudentEmail( String student) {
		return formi1Repo.findOneByStudentEmail(student);
	}
	
	
	
	@Override
	public List<Form_i_3> getFormi3() {
		return formi3Repo.findAll();
	}

	@Override
	public Form_i_3 addFormi3(Form_i_3 c) {
		System.out.println("this is impl"+c.getStudentId());
		Form_i_3 exists =  formi3Repo.findOneByStudentEmail(c.getStudentEmail());
		if(exists!=null){
			exists.setCgpa(c.getCgpa());
			exists.setSemester(c.getSemester());
			exists.setStudentName(c.getStudentName());
			exists.setYear(c.getYear());
			exists.setStudentId(c.getStudentId());
			c=exists;
		}
		return formi3Repo.save(c);
		
	}
	;

	@Override
	public Form_i_3 getFormI3ByFormId(String id) {
		return formi3Repo.findOneByFormId(id);
	}

	@Override
	public Form_i_3 getFormi3ByStudentID(String studentID) {
		return formi3Repo.findOneBystudentId(studentID);
	}

	@Override
	public List<Form_i_3> getFormi3BystatusAndsupervisorEmail(String status, String supervisorEmail) {
		return formi3Repo.findAllByStatusAndSupervisorEmail(status, supervisorEmail);
	}
	

	@Override
	public Form_i_3 getFormi3ByStatus(String status) {
		return formi3Repo.findOneByStatus(status);
	}

	@Override
	public Form_i_3 updateFormi3ByFormid(String formid, Form_i_3 c) {

		Form_i_3 o =  formi3Repo.findOneByFormId(formid);
		if(o!=null) {
			System.out.println(
					o.getStatus() +"\n"
					+o.getFormId() +"\n"
					+o.getStudentId() +"\n"
					+o.getStudentName() +"\n"
			);
			c.setFormId(formid);

			Update update = new Update();
			update.set("age", 100);

			c.setStatus("COMPLETED");
			c.setStudentId(o.getStudentId());
			c.setStudentName(o.getStudentName());
			c.setStudentEmail(o.getStudentEmail());
			c.setSemester(o.getSemester());
			c.setYear(o.getYear());
			c.setCgpa(o.getCgpa());

			formi3Repo.save(c);

			return c;
		}else {
			return o;
		}
	}

	@Override
	public Form_i_3 getFormi3BystatusAndstudentEmail( String student) {
		return formi3Repo.findOneByStudentEmail(student);
	}

}
