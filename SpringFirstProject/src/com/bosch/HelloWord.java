package com.bosch;

public class HelloWord {
	private String name;
	private String email;
	public HelloWord() {
		
	}
	public HelloWord(String name, String email) {
		super();
		this.name = name;
		this.email = email;
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

	public String sayHello() {
		return "Hello "+name +"! Your Email :"+email;
	}
}
