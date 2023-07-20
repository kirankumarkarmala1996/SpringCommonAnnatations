package com.SpringWithoutComponent;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ScieTeacher implements Teacher {

	public void teach() {
		System.out.println("Im Your science Teacher");
		System.out.println("I will teach you science");
		
	}

}
