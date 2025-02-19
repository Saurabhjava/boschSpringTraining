package com.bosch.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosch.dao.IEmployeeRepo;
import com.bosch.exception.EmployeeNotFoundException;
import com.bosch.exception.EmployeeUpdateException;
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
	public  Employee getEmployee(int empid) throws EmployeeNotFoundException {
		Optional<Employee> op=repo.findById(empid);
		if(op.isEmpty())
			throw new EmployeeNotFoundException("Employee Not available for given ID");
		else
			return op.get();
	}
	@Override
	public Employee createEmployee(Employee e) {
		
		return repo.saveAndFlush(e);
	}
	@Override
	public Employee updateEmployee(Employee e) throws EmployeeNotFoundException, EmployeeUpdateException {
		/*
		 * if(getEmployee(e.getEmpid())!=null) return repo.saveAndFlush(e); else
		 */
			throw new EmployeeUpdateException("Can't update bewcause employee not available");
		
	}
	@Override
	public List<Employee> deleteEmployee(int empid) {
		repo.deleteById(empid);
		return repo.findAll();
	}

}
