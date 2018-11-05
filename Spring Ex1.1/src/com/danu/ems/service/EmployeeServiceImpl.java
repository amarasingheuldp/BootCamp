package com.danu.ems.service;

import com.danu.ems.repository.EmployeeRepository;
import com.danu.ems.repository.HibernateEmployeeRepositoryImpl;

import java.util.List;

import com.danu.ems.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeRepository employeeRepository;// = new HibernateEmployeeRepositoryImpl();
	
/*	public EmployeeServiceImpl() {
	}
	
	public EmployeeServiceImpl(EmployeeRepository employeeRespository) {
		System.out.println("Constructor injection fired");
		this.employeeRepository = employeeRespository;
	}
*/
	
	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}

	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		System.out.println("Setter fired");
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<Employee> getAllEmployees(){
		return employeeRepository.getAllEmployees();
	}

}
