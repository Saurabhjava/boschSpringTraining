package com.bosch.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosch.dao.IEmployeeRepo;
import com.bosch.model.Employee;

@Service
public class EmployeeService implements IEmployeeService {
	
	@Autowired
	private IEmployeeRepo repo;
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	@Override
	public  Employee getEmployee(int empid) {
		Optional<Employee> op=repo.findById(empid);
		if(op.isEmpty())
			return null;
		else
			return op.get();
	}
	@Override
	public Employee createEmployee(Employee e) {
		
		return repo.saveAndFlush(e);
	}

}
