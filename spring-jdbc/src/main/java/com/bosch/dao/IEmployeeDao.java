package com.bosch.dao;

import java.util.List;

import com.bosch.bean.Employee;

public interface IEmployeeDao {
	public List<Employee> getAllEmployee();
	public String addEmployee(Employee e);
}
