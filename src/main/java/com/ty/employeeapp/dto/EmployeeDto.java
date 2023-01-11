package com.ty.employeeapp.dto;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_table")
public class EmployeeDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="emp_id")
	private int employeeId;
	
	@Column(name = "emp_name")
	private String name;
	
	@Column(name="email_id")
	private String emailId;
	
	@Column(name="emp_dob")
	private LocalDate dateOfBirth;
	
	@Column(name="age")
	private int age;
	
	@Column(name="salary")
	private double salary;
	
	@Column(name="status")
	private String status;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

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

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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
		return "EmployeeDto [employeeId=" + employeeId + ", name=" + name + ", emailId=" + emailId + ", dateOfBirth="
				+ dateOfBirth + ", age=" + age + ", salary=" + salary + ", status=" + status + "]";
	}
	
}
