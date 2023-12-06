package com.validation.springbootvalidation.repository;


import com.validation.springbootvalidation.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {



}
