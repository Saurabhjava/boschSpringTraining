package com.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Car {
	private ITyre tyre;
	@Value("${name}")
	private String name;
	public ITyre getTyre() {
		return tyre;
	}

	public void setTyre(ITyre tyre) {
		this.tyre = tyre;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void printCarDetails() {
		System.out.println("Name:"+name);
		tyre.getTyreDetails();
	}
}
