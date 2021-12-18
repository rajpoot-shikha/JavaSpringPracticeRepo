package com.shikha.beans;

public class HelloBean {
	static {
		System.out.println("HelloBean Class Loading");
	}
	
	public HelloBean() {
		System.out.println("HelloBean Class Instantiation");
	}
	
	private String name;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public void sayHello() {
		System.out.println("Hello by "+name);
	}
}
