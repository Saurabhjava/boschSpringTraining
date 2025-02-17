package com.bosch;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

//@Component("dept")
@Controller
//@Scope("prototype")
public class Department {
	private int did;
	@Value("${deptname}")
	private String deptName;
	@Autowired
	private Set<Employee> emp;	
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
		
	public Set<Employee> getEmp() {
		return emp;
	}
	public void setEmp(Set<Employee> emp) {
		this.emp = emp;
	}
	public void printDeptWithEmployee() {
		System.out.println("Dmpartment Id:"+did);
		System.out.println("Dmpartment Name:"+deptName);
		emp.forEach(e->{
			System.out.println(e.getEmpid()+"\t"+e.getName()+"\t"+e.getEmail());
			
		});
		
	}
}
