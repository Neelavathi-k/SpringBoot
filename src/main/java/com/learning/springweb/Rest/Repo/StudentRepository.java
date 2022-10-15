package com.learning.springweb.Rest.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.springweb.Rest.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
