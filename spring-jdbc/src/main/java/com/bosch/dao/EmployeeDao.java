package com.bosch.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bosch.bean.Employee;

@Repository
public class EmployeeDao implements IEmployeeDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> emps=jdbcTemplate.query("select * from emp", BeanPropertyRowMapper.newInstance(Employee.class));
		return emps;
	}

}
