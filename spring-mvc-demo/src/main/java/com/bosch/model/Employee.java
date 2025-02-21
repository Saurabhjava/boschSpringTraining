package com.bosch.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empid;
	@NotNull(message = "Name cann't ne null")
	@NotBlank(message = "Name cann't ne blank")
	private String name;
	@Email(message = "Invalid Email")
	@NotBlank(message = "Email cann't ne blank")
	private String email;
	@JsonFormat(pattern = "dd-MMM-yyyy")
	private LocalDate dob;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(int empid, String name, String email, LocalDate dob) {
		super();
		this.empid = empid;
		this.name = name;
		this.email = email;
		this.dob = dob;
	}


	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	
}
