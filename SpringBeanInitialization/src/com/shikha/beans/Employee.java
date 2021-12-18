package com.shikha.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean {
	private String ename;
	private int eno;
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	
	//first way to initialize the object is create custom init and destroy method and register them in config file
//	public void init() {
//		ename = "Shikha";
//		eno = 111;
//	}
//	
//	public void destroy() {
//		ename = "";
//		eno = 0;
//	}
	
	//second way is to use InitializingBean & DisposableBean interface
	@Override
	public void destroy() throws Exception {
		ename = "";
		eno = 0;
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		ename = "Ramesh";
		eno = 101;
		
	}
	
	
	public void displayEmp() {
		System.out.println("Employee Name: "+ename+" Employee No: "+eno);
	}
	
	//thrid way is to use annotations @PostConstruct & @PreDestroy
	
	@PostConstruct
	public void initializeBean() {
		ename = "Ram";
		eno = 1111;
	}
	
	@PreDestroy
	public void destroyBean() {
		ename = "";
		eno = 0;
	}
}
