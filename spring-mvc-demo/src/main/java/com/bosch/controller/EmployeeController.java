package com.bosch.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bosch.exception.EmployeeNotFoundException;
import com.bosch.exception.EmployeeUpdateException;
import com.bosch.model.Employee;
import com.bosch.service.IEmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("employees")
public class EmployeeController {
	@Autowired
	private IEmployeeService service;
	
	@GetMapping(produces = {"application/json","application/xml"})
	public List<Employee> allEmps() {
		return service.getAllEmployees(); 
	}
	
	@GetMapping("/{eid}")
	public Employee sayHello1(@PathVariable int eid) throws EmployeeNotFoundException {
		Employee e=service.getEmployee(eid);
		return e;
	}
	
	@PostMapping
	public Employee saveEmployee(@Valid @RequestBody Employee e) {
		return service.createEmployee(e);
	}
	
	@PutMapping
	public Employee updaEmployee(@RequestBody Employee e) throws EmployeeNotFoundException, EmployeeUpdateException {
		return service.updateEmployee(e);
	}
	
	@DeleteMapping("/{eid}")
	public List<Employee> delEmps(@PathVariable int eid) {
		return service.deleteEmployee(eid); 
	}
}





