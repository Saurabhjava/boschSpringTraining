package com.bosch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bosch.entity.Employee;
import com.bosch.service.EmployeeService;
import com.bosch.service.IEmployeeService;

@SpringBootApplication
public class SpringDataJpaDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(SpringDataJpaDemoApplication.class, args);
		IEmployeeService es=ctx.getBean(EmployeeService.class);
		//System.out.println(es.createEmployee(new Employee("Kartik", "kartik@gmail.com")));
		//System.out.println(es.getEmployee(12));
		es.getAllEmployee().forEach(e->System.out.println(e));
	}

}
