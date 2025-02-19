package com.bosch.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bosch.model.Employee;

public interface IEmployeeRepo extends JpaRepository<Employee,Integer>{

}
