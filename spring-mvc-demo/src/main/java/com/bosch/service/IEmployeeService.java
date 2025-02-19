package com.bosch.service;

import java.util.List;

import com.bosch.exception.EmployeeNotFoundException;
import com.bosch.exception.EmployeeUpdateException;
import com.bosch.model.Employee;

public interface IEmployeeService {
	public List<Employee> getAllEmployees();
	public Employee getEmployee(int empid) throws EmployeeNotFoundException;
	public Employee createEmployee(Employee e);
	public Employee updateEmployee(Employee e) throws EmployeeNotFoundException, EmployeeUpdateException;
	public List<Employee> deleteEmployee(int empid);
}

