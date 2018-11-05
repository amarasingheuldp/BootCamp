package com.danu.ems.repository;

import java.util.ArrayList;
import java.util.List;

import com.danu.ems.model.Employee;

public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {
	
	/* (non-Javadoc)
	 * @see com.danu.ems.repository.EmployeeRepository#getAllEmployees()
	 */
	@Override
	public List<Employee> getAllEmployees(){
		
		List<Employee> employees = new ArrayList<>();
		Employee employee = new Employee();
		employee.setLocation("Padukka");
		employee.setLocation("Danu");
		employees.add(employee);
		return employees;
		}

}
