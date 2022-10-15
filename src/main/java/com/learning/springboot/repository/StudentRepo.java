package com.learning.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.springboot.jpa.dto.Student;

public interface StudentRepo extends JpaRepository<Student,	Long>{

}
