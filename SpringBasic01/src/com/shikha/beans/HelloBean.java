package com.shikha.beans;

public class HelloBean {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void sayHello() {
		System.out.println("Say Hello...."+name);
	}
}
