package com.shikha.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shikha.beans.Employee;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/shikha/resources/applicationContext.xml");
		Employee emp = (Employee)ctx.getBean("empBean");
		emp.displayEmp();	
	}
}
