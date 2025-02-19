package com.bosch.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bosch.model.Employee;
import com.bosch.service.IEmployeeService;

@RestController
@RequestMapping("employees")
public class EmployeeController {
	@Autowired
	private IEmployeeService service;
	
	@GetMapping
	public List<Employee> allEmps() {
		return service.getAllEmployees(); 
	}
	
	@GetMapping("/{eid}")
	public ResponseEntity<Employee> sayHello1(@PathVariable int eid) {
		Employee e=service.getEmployee(eid);
		if(e != null)
			return new ResponseEntity<Employee>(e,HttpStatus.FOUND);
		else
			return new ResponseEntity("Employee Not Found", HttpStatus.NOT_FOUND);
	}
	
	@PostMapping
	public Employee saveEmployee(@RequestBody Employee e) {
		return service.createEmployee(e);
	}
}





