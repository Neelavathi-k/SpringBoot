package com.learning.springweb.Rest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.learning.springweb.Rest.Repo.StudentRepository;
import com.learning.springweb.Rest.model.Student;

@RestController
public class StudentController {

	@Autowired
	StudentRepository repository;
	
	@RequestMapping(value="/students", method = RequestMethod.GET)
	public List<Student> getStudents() {
		return repository.findAll();
	}

	@RequestMapping(value="/students/{id}", method=RequestMethod.GET)
	public Student getStudent(@PathVariable("id") int id) {
		return repository.findById(id).get();
	}
	
	@RequestMapping(value="/students", method=RequestMethod.POST)
	public Student createStudent(@RequestBody Student student) {
		System.out.println("inside insert");
		return repository.save(student);
	}
	
	@RequestMapping(value="/students", method=RequestMethod.PUT)
	public Student updateStudent(@RequestBody Student student) {
		return repository.save(student);
	}
	
	@RequestMapping(value="/students/{id}", method=RequestMethod.DELETE)
	public void deleteStudent(@PathVariable("id") int id) {
		repository.deleteById(id);
	}

}
