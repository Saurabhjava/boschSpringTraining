package com.bosch.service;

import java.util.List;

import com.bosch.entity.Employee;

public interface IEmployeeService {
	public String createEmployee(Employee emp);
	public Employee getEmployee(int empid);
	public List<Employee> getAllEmployee();
	public String deleteEmployee(int empid);
	public String updateEmployee(Employee e);
}
