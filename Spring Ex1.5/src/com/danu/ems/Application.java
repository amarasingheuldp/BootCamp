package com.danu.ems;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.danu.ems.config.ApplicationConfiguration;
import com.danu.ems.model.Employee;
import com.danu.ems.service.EmployeeService;

public class Application {
	
	public static void main(String args[]){
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		
		EmployeeService employeeService = applicationContext.getBean("employeeService",EmployeeService.class);
		
		//EmployeeService employeeService = new EmployeeServiceImpl();
		List<Employee> employees =  employeeService.getAllEmployees();
		
		
		for(Employee employee: employees ){
			System.out.println(employee.getName() + " from " + employee.getLocation());
			
		}
	}

}