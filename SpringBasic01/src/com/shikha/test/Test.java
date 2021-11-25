package com.shikha.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shikha.beans.HelloBean;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/shikha/resources/applicationContext.xml");
		HelloBean bean = (HelloBean)context.getBean("helloBean");
		bean.sayHello();
	}
}
