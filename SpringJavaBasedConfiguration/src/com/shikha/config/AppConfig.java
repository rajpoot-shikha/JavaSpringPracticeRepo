package com.shikha.config;

import org.springframework.context.annotation.*;

import com.shikha.beans.HelloBean;
import com.shikha.beans.WelcomeBean;

//class acts as Config
@Configuration
public class AppConfig {
	static {
		System.out.println("AppConfig Class Loading");
	}
	
	public AppConfig() {
		System.out.println("AppConfig Class Instantiation");
	}
	
	@Bean
	public WelcomeBean welcomeBean() {
		return new WelcomeBean();
	}
	
	@Bean 
	public HelloBean helloBean() {
		HelloBean helloBean = new HelloBean();
		helloBean.setName("Shikha");
		return helloBean;
	}
	
}
