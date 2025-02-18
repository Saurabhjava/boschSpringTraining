package com.bosch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bosch.dao.EmployeeDao;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(SpringJdbcApplication.class, args);
		
		EmployeeDao edao=ctx.getBean(EmployeeDao.class);
		edao.getAllEmployee().forEach(e->System.out.println(e));
	}

}
