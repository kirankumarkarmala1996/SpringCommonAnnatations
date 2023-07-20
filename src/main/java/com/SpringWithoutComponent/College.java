package com.SpringWithoutComponent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {
	private String collegeName;

	@Autowired // if we use autowire at fields level we don't need setter methods
	private Principle principle;
	@Autowired
//	@Qualifier("mathTeacher")// if we have different implementations @primary and @qualifier is best
	private Teacher teacher;// Chose to print particular class

//Instead Of Constructor Injection use Setter Injection
	/*
	 * public College(Principle principle) { this.principle = principle;
	 * System.out.println("Injecting dependency using constructor injection "); }
	 */

//	@Autowired
//	public void setPrinciple(Principle principle) {
//		this.principle = principle;
//		System.out.println("Injecting dependency using setter injection ");
//	}
//	
//	@Autowired
//	public void setTeacher(Teacher teacher) {
//		this.teacher = teacher;
//	}

	@Required
	@Value("${college.Name}")
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public void test() {
		principle.principleInfo();
		teacher.teach();
		System.out.println("college name is :" + collegeName);
//		System.out.println("testing the college object");
	}

}
