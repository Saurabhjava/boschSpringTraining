package com.bosch;

import java.util.Objects;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Override
	public int hashCode() {
		return Objects.hash(email, empid, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(email, other.email) && empid == other.empid && Objects.equals(name, other.name);
	}
	private int empid;
	private String name;
	private String email;
	
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
	
	
}
