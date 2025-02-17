package com.bosch;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bosch.config.MyConfig;

public class Main {

	public static void main(String[] args) {
		//ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		ApplicationContext ctx=new AnnotationConfigApplicationContext(MyConfig.class);
		/*
		 * HelloWord h=(HelloWord)ctx.getBean("hello");
		 * System.out.println(h.sayHello());
		 */
		
		//Department d=(Department)ctx.getBean("dept");
		Department d=ctx.getBean(Department.class);
		//d.setEmp(new Employee());
		d.printDeptWithEmployee();
	}

}
