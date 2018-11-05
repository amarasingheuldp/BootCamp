package com.danushka.ems;

import com.danushka.ems.service.EmployeeService;
import com.danushka.ems.service.EmployeeServiceImpl;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.danushka.ems.model.Employee;

public class Application {
	
	public static void main(String args[]){
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		EmployeeService employeeService = applicationContext.getBean("employeeService",EmployeeService.class);
		
		//EmployeeService employeeService = new EmployeeServiceImpl();
		List<Employee> employees =  employeeService.getAllEmployees();
		
		
		for(Employee employee: employees ){
			System.out.println(employee.getName() + " from " + employee.getLocation());
			
		}
	}

}
