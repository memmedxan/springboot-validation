package com.validation.springbootvalidation.controller;

import com.validation.springbootvalidation.model.Student;
import com.validation.springbootvalidation.repository.StudentRepository;
import com.validation.springbootvalidation.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

@PostMapping("/save")
  ResponseEntity <String> addStudent(@Valid @RequestBody Student student){
      studentService.save(student);
      return ResponseEntity.ok("Student saved.");
  }
}
