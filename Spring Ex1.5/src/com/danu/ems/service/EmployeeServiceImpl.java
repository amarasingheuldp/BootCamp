package com.danu.ems.service;

import java.util.List;

import com.danu.ems.repository.EmployeeRepository;
import com.danu.ems.model.Employee;
import com.danu.ems.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeRepository employeeRespository;// = new HibernateEmployeeRepositoryImpl();
	
	public EmployeeServiceImpl() {
		System.out.println("Constructor fired");
	}
	
	public EmployeeServiceImpl(EmployeeRepository employeeRespository) {
		System.out.println("Constructor injection fired");
		this.employeeRespository = employeeRespository;
	}

	
	
	/* (non-Javadoc)
	 * @see com.danushka.ems.service.EmployeeService#getAllEmployees()
	 */
	/* (non-Javadoc)
	 * @see com.danu.ems.service.EmployeeService#getAllEmployees()
	 */
	@Override
	public List<Employee> getAllEmployees(){
		return employeeRespository.getAllEmployees();
		
	}

	public EmployeeRepository getEmployeeRespository() {
		return employeeRespository;
	}

	public void setEmployeeRespository(EmployeeRepository employeeRespository) {
		System.out.println("setter injection fired");
		this.employeeRespository = employeeRespository;
	}

}