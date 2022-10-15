package com.learning.springboot.thymeleaf.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.learning.springboot.thymeleaf.dto.Student;

@Controller
public class HelloController {

	@RequestMapping("/hellomap")
	public String hello() {
		return "hello";
	}
	
	@RequestMapping("/senddata")
	public ModelAndView sendData() {
		ModelAndView modelAndView = new ModelAndView("data");
		modelAndView.addObject("message", "Don't Worry, Be happy !!");
		return modelAndView;
	}
	
	@RequestMapping("/getstudent")
	public ModelAndView getStudent() {
		ModelAndView modelAndView = new ModelAndView("student");
		Student student = new Student();
		student.setName("Neelavathi K");
		student.setScore("100");
		modelAndView.addObject("student", student);
		return modelAndView;
	}
	
	@RequestMapping("/getstudents")
	public ModelAndView getStudents() {
		ModelAndView modelAndView = new ModelAndView("studentList");
		ArrayList<Student> studentList = new ArrayList<>();
		
		Student student = new Student();
		student.setName("Neelavathi K ");
		student.setScore("100");
		studentList.add(student);
		
		student = new Student();
		student.setName("Neelavathi");
		student.setScore("90");
		studentList.add(student);
		
		student = new Student();
		student.setName("Neela");
		student.setScore("80");
		studentList.add(student);
		
		modelAndView.addObject("student", student);
		modelAndView.addObject("studentList", studentList);
		return modelAndView;
	}
	
	@RequestMapping("/displayStudentForm")
	public ModelAndView displayStudentForm() {
		ModelAndView modelAndView = new ModelAndView("studentForm");
		Student student = new Student();
		modelAndView.addObject("Student", student);
		return modelAndView;
	}
	
	@RequestMapping("/saveStudent")
	public ModelAndView saveStudent(@ModelAttribute Student student) {
		System.out.println("student.getName() :: " + student.getName());
		System.out.println("student.getScore() :: " + student.getScore());
		ModelAndView modelAndView = new ModelAndView("result");
		return modelAndView;
	}
}
