package com.spm.spmbackend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "form_i_1")
public class Form_i_1 {
	
	@Id
	private String formId;

	private String status;
	private String studentId;
	private String studentName;
	private String studentAddress;
	private String studentHomePhone;
	private String studentMobilePhone;
	private String studentEmail;

	private int semester;
	private int year;
	private double cgpa;

	private String companyName;
	private String companyAddres;

	private String supervisorName;
	private String supervisorTitle;
	private String supervisorPhone;
	private String supervisorEmail;

	private String internshipStartDate;
	private String internshipEndDate;
	private int hoursPerWeek;

	private String expectedTasks;
	private String learningOutcomes;

	private String externalSupervisorName;
	private String date;

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

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public String getStudentHomePhone() {
		return studentHomePhone;
	}

	public void setStudentHomePhone(String studentHomePhone) {
		this.studentHomePhone = studentHomePhone;
	}

	public String getStudentMobilePhone() {
		return studentMobilePhone;
	}

	public void setStudentMobilePhone(String studentMobilePhone) {
		this.studentMobilePhone = studentMobilePhone;
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

	public String getSupervisorPhone() {
		return supervisorPhone;
	}

	public void setSupervisorPhone(String supervisorPhone) {
		this.supervisorPhone = supervisorPhone;
	}

	public String getSupervisorEmail() {
		return supervisorEmail;
	}

	public void setSupervisorEmail(String supervisorEmail) {
		this.supervisorEmail = supervisorEmail;
	}

	public String getInternshipStartDate() {
		return internshipStartDate;
	}

	public void setInternshipStartDate(String internshipStartDate) {
		this.internshipStartDate = internshipStartDate;
	}

	public String getInternshipEndDate() {
		return internshipEndDate;
	}

	public void setInternshipEndDate(String internshipEndDate) {
		this.internshipEndDate = internshipEndDate;
	}

	public int getHoursPerWeek() {
		return hoursPerWeek;
	}

	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}

	public String getExpectedTasks() {
		return expectedTasks;
	}

	public void setExpectedTasks(String expectedTasks) {
		this.expectedTasks = expectedTasks;
	}

	public String getLearningOutcomes() {
		return learningOutcomes;
	}

	public void setLearningOutcomes(String learningOutcomes) {
		this.learningOutcomes = learningOutcomes;
	}

	public String getExternalSupervisorName() {
		return externalSupervisorName;
	}

	public void setExternalSupervisorName(String externalSupervisorName) {
		this.externalSupervisorName = externalSupervisorName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}
