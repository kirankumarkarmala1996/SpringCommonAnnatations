package com.SpringWithoutComponent;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher {

	public void teach() {
		System.out.println("Im your math Teacher ");
		System.out.println("Im will teach you math");
	}

}
