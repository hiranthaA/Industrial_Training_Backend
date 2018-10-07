package com.spm.spmbackend.service;

import java.util.List;
import com.spm.spmbackend.model.Form_i_1;
import com.spm.spmbackend.model.Form_i_3;

public interface FormService {
	
	public List<Form_i_1> getFormi1();
	public Form_i_1 getFormi1ByStudentID(String studentID);
	public Form_i_1 addFormi1(Form_i_1 c) ;
	public Form_i_1 getFormI1ByFormId(String id);
	public List<Form_i_1> getFormi1BystatusAndsupervisorEmail(String status, String supervisorEmail);
	public Form_i_1 getFormi1ByStatus(String status);
	public Form_i_1 updateFormi1ByFormid(String formid,Form_i_1 c);
	public Form_i_1 getFormi1BystatusAndstudentEmail( String student);
	
	
	public List<Form_i_3> getFormi3();
	public Form_i_3 getFormi3ByStudentID(String studentID);
	public Form_i_3 addFormi3(Form_i_3 c) ;
	public Form_i_3 getFormI3ByFormId(String id);
	public List<Form_i_3> getFormi3BystatusAndsupervisorEmail(String status, String supervisorEmail);
	public Form_i_3 getFormi3ByStatus(String status);
	public Form_i_3 updateFormi3ByFormid(String formid,Form_i_3 c);
	public Form_i_3 getFormi3BystatusAndstudentEmail( String student);
	
	
	
	
}