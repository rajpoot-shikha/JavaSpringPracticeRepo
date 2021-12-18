package com.shikha.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.shikha.beans.Employee;

public class Test {
	public static void main(String[] args) {
	//create resource object
	Resource resource = new ClassPathResource("com/shikha/resources/applicationContext.xml");
	//config is loaded, parsed and bean objects are created.
	
	//create factory
	BeanFactory factory = new XmlBeanFactory(resource);
	
	//get your bean using bean factory
	Employee employee = (Employee)factory.getBean("empBean");
	
	employee.getEmpDetails();
	}
}
