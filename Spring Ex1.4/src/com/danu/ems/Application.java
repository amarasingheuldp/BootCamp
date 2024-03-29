package com.danu.ems;

import com.danu.ems.service.EmployeeService;
import com.danu.ems.service.EmployeeServiceImpl;
import com.danu.ems.service.EmployeeServiceImpl;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.danu.ems.model.Employee;

public class Application {
	
	public static void main(String args[]){
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		EmployeeService employeeService = applicationContext.getBean("employeeService",EmployeeServiceImpl.class);
		
		//EmployeeService employeeService = new EmployeeServiceImpl();
		List<Employee> employees =  employeeService.getAllEmployees();
		
		
		for(Employee employee: employees ){
			System.out.println(employee.getName() + " from " + employee.getLocation());
			
		}
	}

}