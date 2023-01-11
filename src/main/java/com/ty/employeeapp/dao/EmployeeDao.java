package com.ty.employeeapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.employeeapp.dto.EmployeeDto;

@Repository
public class EmployeeDao {
	
	@Autowired
	private EntityManagerFactory factory;
	
	public EmployeeDto insertEmployee(EmployeeDto newEmployeeDto) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		try {
			transaction.begin();
			manager.persist(newEmployeeDto);
			transaction.commit();
			return newEmployeeDto;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return null;
		}
	}

	public List<EmployeeDto> getAllEmployee() {
		// TODO Auto-generated method stub
		EntityManager manager = factory.createEntityManager();
		String jpql="FROM EmployeeDto";
		Query query = manager.createQuery(jpql);
		return query.getResultList();
		
	}

	public EmployeeDto updateEmployee(EmployeeDto employeeDto) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		try {
			transaction.begin();
			manager.merge(employeeDto);
			transaction.commit();
			return employeeDto;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return null;
		}
		
	}

	public EmployeeDto deleteEmployee(EmployeeDto dto) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		try {
			transaction.begin();
			EmployeeDto employeeDto=manager.merge(dto);
			manager.remove(employeeDto);
			transaction.commit(); 
			return employeeDto;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return null;
		}
		
	}

	public EmployeeDto searchEmployee(int employeeId) {
		// TODO Auto-generated method stub
		return null;
	}


}
