package com.validation.springbootvalidation.service;


import com.validation.springbootvalidation.model.Student;
import com.validation.springbootvalidation.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public void save(Student student){
        studentRepository.save(student);



    }

}
