package com.SpringWithoutComponent;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages ="com.SpringWithoutComponent")
@PropertySource("classpath:college-info.properties")
public class CollegeConfig {
 
	
	/*
	 * @Bean public Principle principleBean() {
	 * 
	 * return new Principle(); }
	 * 
	 * @Bean public Teacher mathTeacherBean() {
	 * 
	 * return new MathTeacher(); }
	 * 
	 * @Bean public Teacher ScieTeacherBean() { return new ScieTeacher(); }
	 * 
	 * @Bean public College collegeobj() { // College col = new
	 * College(principleBean()); College col = new College();
	 * col.setPrinciple(principleBean()); System.out.println("===================");
	 * col.setTeacher(mathTeacherBean()); col.setTeacher(ScieTeacherBean()); return
	 * col; }
	 */

}
