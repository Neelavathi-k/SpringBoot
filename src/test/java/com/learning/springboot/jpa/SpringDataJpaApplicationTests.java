package com.learning.springboot.jpa;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.learning.springboot.jpa.dto.Student;
import com.learning.springboot.repository.StudentRepo;

@SpringBootTest
class SpringDataJpaApplicationTests {

	@Autowired
	private StudentRepo repo;
	
	@Test
	void testSaveStudent() {
		Student stud = new Student();
		stud.setId(001);
		stud.setName("Neelavathi K");
		stud.setScore(100);
		repo.save(stud);
		
		/*
		 * Student student2 = repo.findById(001L).get(); assertNotNull(student2);
		 */
	}

}
