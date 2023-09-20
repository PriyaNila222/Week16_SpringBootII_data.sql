package com.greatlearning.library.serviceImpl;

import org.springframework.stereotype.Service;

import com.greatlearning.library.model.GreatLearning;
import com.greatlearning.library.service.ExampleService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ExampleServiceImpl implements ExampleService {
	
	@Override
	public GreatLearning get() {
		log.info("Inside get() method");
		GreatLearning gl = new GreatLearning();
		gl.setCourseName("FSD");
		gl.setCourseType("IT");
		gl.setInstructorName("Priya");
		return gl;
		
	}
	
	@Override
	public GreatLearning customInfo(String courseName, String courseType, String instructorName) {
		log.info("Inside customInfo() method");
		GreatLearning gl = new GreatLearning();
		gl.setCourseName(courseName);
		gl.setCourseType(courseType);
		gl.setInstructorName(instructorName);
		return gl;
	}
	

}
