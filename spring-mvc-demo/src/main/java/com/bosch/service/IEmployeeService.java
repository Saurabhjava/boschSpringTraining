package com.bosch.service;

import java.util.List;

import com.bosch.model.Employee;

public interface IEmployeeService {
	public List<Employee> getAllEmployees();
	public Employee getEmployee(int empid);
	public Employee createEmployee(Employee e);
}

