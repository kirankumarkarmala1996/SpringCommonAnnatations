package com.SpringWithoutComponent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(CollegeConfig.class);
		College obj=context.getBean("college",College.class);
		System.out.println("college object :"+obj);
		obj.test();
//		type casting
//		((AnnotationConfigApplicationContext)context).close();// or else
		context.close(); 
	}

}
