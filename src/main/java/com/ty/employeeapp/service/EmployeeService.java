package com.ty.employeeapp.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.employeeapp.beans.Employee;
import com.ty.employeeapp.dao.EmployeeDao;
import com.ty.employeeapp.dto.EmployeeDto;



@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;

	public EmployeeDto saveEmployee(Employee employee) {

		EmployeeDto dto = new EmployeeDto();
		dto.setName(employee.getName());
		dto.setEmailId(employee.getEmailId());
		LocalDate dateOfBirth=LocalDate.parse(employee.getDateOfBirth());
		dto.setDateOfBirth(dateOfBirth);
		dto.setSalary(employee.getSalary());
		dto.setStatus(employee.getStatus());
		

		return employeeDao.insertEmployee(dto);
	}
	public List<EmployeeDto> getAllEmployee() {
		return employeeDao.getAllEmployee();
	}
	public EmployeeDto updateEmployee(int employeeId , Employee employee) {

		EmployeeDto employeeDto = new EmployeeDto();
		employeeDto.setName(employee.getName());
		employeeDto.setEmailId(employee.getEmailId());
		LocalDate dateOfBirth=LocalDate.parse(employee.getDateOfBirth());
		employeeDto.setDateOfBirth(dateOfBirth);
		employeeDto.setSalary(employee.getSalary());
		employeeDto.setStatus(employee.getStatus());
		

		
		return employeeDao.updateEmployee(employeeDto);
	}

	public EmployeeDto deleteEmployee(int employeeId) {
		// TODO Auto-generated method stub
		EmployeeDto employeeDto=employeeDao.searchEmployee(employeeId);
		
		if(employeeDto==null) {
			return null;
		}else {
			return employeeDao.deleteEmployee(employeeDto);
		}
		
		
	}
	public EmployeeDto searchEmployee(int employeeId) {
		// TODO Auto-generated method stub
		return employeeDao.searchEmployee(employeeId);

	}


}
