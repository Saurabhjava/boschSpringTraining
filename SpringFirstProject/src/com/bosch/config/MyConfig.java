package com.bosch.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.bosch.Employee;

@Configuration
@ComponentScan("com.bosch")
@PropertySource(value="classpath:data.properties")
public class MyConfig {
	
	@Bean
	public Employee getEmployee() {
		Employee e=new Employee();
		e.setEmpid(101);
		e.setName("Amit");
		e.setEmail("amit@gmail.com");
		return e;
	}
	
	@Bean
	public Employee getEmployee1() {
		Employee e=new Employee();
		e.setEmpid(102);
		e.setName("Rahul");
		e.setEmail("rahul@gmail.com");
		return e;
	}
	
	@Bean
	public Employee getEmployee2() {
		Employee e=new Employee();
		e.setEmpid(103);
		e.setName("Raj");
		e.setEmail("raj@gmail.com");
		return e;
	}
}
