package com.CreateOBJwithoutXmlfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(DoctorConfig.class);
		Doctor doctor=context.getBean("doctorobj",Doctor.class);
		System.out.println(doctor);
	}

}
