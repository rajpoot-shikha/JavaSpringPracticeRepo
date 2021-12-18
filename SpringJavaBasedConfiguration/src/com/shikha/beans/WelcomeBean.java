package com.shikha.beans;

public class WelcomeBean {
	//private String message;
	static {
		System.out.println("WelcomeBean Class Loading");
	}
	
	public WelcomeBean(){
		System.out.println("WelcomeBean Class Instantiation");
	}
	
	public void getWelcomeMessage() {
		System.out.println("Hello User welcome to shikha solutions!");
	}
	
}
