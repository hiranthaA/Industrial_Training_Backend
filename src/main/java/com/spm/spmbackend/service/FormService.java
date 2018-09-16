package com.spm.spmbackend.service;

import java.util.List;
import com.spm.spmbackend.model.Form_i_1;

public interface FormService {
	
	public List<Form_i_1> getFormi1();
	public Form_i_1 getFormi1ByStudentID(String studentID);
	public Form_i_1 addFormi1(Form_i_1 c) ;
	public Form_i_1 getFormi1BystatusAndsupervisorEmail(String status, String supervisorEmail);
	public Form_i_1 getFormi1ByStatus(String status);
	public Form_i_1 updateFormi1ByFormid(String formid,Form_i_1 c);
	public Form_i_1 getFormi1BystatusAndstudentEmail( String student);
	
}