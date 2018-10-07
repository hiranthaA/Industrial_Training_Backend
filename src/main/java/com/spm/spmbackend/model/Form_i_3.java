package com.spm.spmbackend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "form_i_3")
public class Form_i_3 {
	
	@Id
	private String formId;

	private String status;
	private String studentId;
	private String studentName;
	private String studentEmail;
	private String studentAddress;
	private String studentMobile;

	private int semester;
	private int year;
	private double cgpa;

	private String companyName;
	private String companyContact;
	private String companyAddres;

	private String supervisorName;
	private String supervisorTitle;
    private String supervisorDesignation;
    private String supervisorEmail;
    
    private String internshipTitle;
 	private String specialisation;
    
    private String trainingParty;
    private String description;
    private String from;
    private String to;
    private String summary;
    private String details;
    
    public String getFormId() {
		return formId;
	}
	public void setFormId(String formId) {
		this.formId = formId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyContact() {
		return companyContact;
	}
	public void setCompanyContact(String companyContact) {
		this.companyContact = companyContact;
	}
	public String getCompanyAddres() {
		return companyAddres;
	}
	public void setCompanyAddres(String companyAddres) {
		this.companyAddres = companyAddres;
	}
	public String getSupervisorName() {
		return supervisorName;
	}
	public void setSupervisorName(String supervisorName) {
		this.supervisorName = supervisorName;
	}
	public String getSupervisorTitle() {
		return supervisorTitle;
	}
	public void setSupervisorTitle(String supervisorTitle) {
		this.supervisorTitle = supervisorTitle;
	}
	public String getSupervisorDesignation() {
		return supervisorDesignation;
	}
	public void setSupervisorDesignation(String supervisorDesignation) {
		this.supervisorDesignation = supervisorDesignation;
	}
	public String getTrainingParty() {
		return trainingParty;
	}
	public void setTrainingParty(String trainingParty) {
		this.trainingParty = trainingParty;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getSupervisorEmail() {
		return supervisorEmail;
	}
	public void setSupervisorEmail(String supervisorEmail) {
		this.supervisorEmail = supervisorEmail;
	}
	   public String getInternshipTitle() {
			return internshipTitle;
		}
		public void setInternshipTitle(String internshipTitle) {
			this.internshipTitle = internshipTitle;
		}
		public String getSpecialisation() {
			return specialisation;
		}
		public void setSpecialisation(String specialisation) {
			this.specialisation = specialisation;
		}
		public String getStudentAddress() {
			return studentAddress;
		}
		public void setStudentAddress(String studentAddress) {
			this.studentAddress = studentAddress;
		}
		public String getStudentMobile() {
			return studentMobile;
		}
		public void setStudentMobile(String studentMobile) {
			this.studentMobile = studentMobile;
		}

    
}