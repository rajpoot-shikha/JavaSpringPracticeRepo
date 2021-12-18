package com.shikha.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shikha.beans.HelloBean;
import com.shikha.beans.WelcomeBean;
import com.shikha.config.AppConfig;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		//using class name to get the bean object
//		WelcomeBean bean = ctx.getBean(WelcomeBean.class);
//		
//		using method name to get the bean object
//		WelcomeBean bean2 = (WelcomeBean)ctx.getBean("welcomeBean");
//		bean.getWelcomeMessage();	
//		
//		HelloBean helloBean = ctx.getBean(HelloBean.class);
//		helloBean.sayHello();
		
	}
}
