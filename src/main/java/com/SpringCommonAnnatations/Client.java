package com.SpringCommonAnnatations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("Bean.xml");
		College collegestu=context.getBean("collegebean",College.class);
		System.out.println("Spring is creating the college object : "+collegestu);
		
	}

}
