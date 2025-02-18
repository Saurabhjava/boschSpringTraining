package com.bosch.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bosch.dao.IEmployeeDao;
import com.bosch.entity.Employee;

@Service
public class EmployeeService implements IEmployeeService{
	private IEmployeeDao edao;
	
	public EmployeeService(IEmployeeDao edao) {
		this.edao=edao;
	}

	@Override
	public String createEmployee(Employee emp) {
		if(emp.getName().isEmpty() || emp.getEmail().isEmpty())
			return "Invalid Data";
		else
			edao.saveAndFlush(emp);
		return "Employee Saved";
	}

	@Override
	public Employee getEmployee(int empid) {
		// TODO Auto-generated method stub
		Optional<Employee> op=edao.findById(empid);
		if(op.isEmpty())
			return null;
		else
			return op.get();
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return edao.findAll();
	}

	@Override
	public String deleteEmployee(int empid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		return null;
	}

}
