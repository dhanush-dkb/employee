package com.ty.employeeapp.beans;

public class Employee {
	
	private String name;	
	private String emailId;
	private String dateOfBirth;
	private double salary;
	private String status;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", emailId=" + emailId + ", dateOfBirth=" + dateOfBirth + ", salary=" + salary
				+ ", status=" + status + "]";
	}
}
