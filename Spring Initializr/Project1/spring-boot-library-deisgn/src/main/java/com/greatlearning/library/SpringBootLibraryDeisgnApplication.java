package com.greatlearning.library;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.greatlearning.library.model.GreatLearning;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringBootLibraryDeisgnApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLibraryDeisgnApplication.class, args);
		System.out.println("Hi");
		System.out.println("Hello");
		System.out.println("Welcome");
	}

	@Override
	public void run(String... args) throws Exception {
		
		//Getters and Setters
		/*
		 * GreatLearning gl = new GreatLearning(); gl.setCourseName("FSD");
		 * gl.setCourseType("IT"); gl.setInstructorName("Priya");
		 * 
		 * //System.out.println("Printing using gl object: " + gl);
		 * System.out.println("CourseName: " + gl.getCourseName());
		 * System.out.println("CourseType: " + gl.getCourseType());
		 * System.out.println("InstructorName: " + gl.getInstructorName());
		 */
		
		
		//All args constructor
		/*
		 * GreatLearning gl = new GreatLearning("FSD", "IT", "Priya");
		 * System.out.println("Printing using gl object: " + gl);
		 * System.out.println("CourseName: " + gl.getCourseName());
		 * System.out.println("CourseType: " + gl.getCourseType());
		 * System.out.println("InstructorName: " + gl.getInstructorName());
		 */
		
		GreatLearning gl = new GreatLearning();
		gl.setCourseName("FSD");
		System.out.println("Course name: " + gl.getCourseName());
		
		log.info("Great Learning -> {}", gl);

	}

}
