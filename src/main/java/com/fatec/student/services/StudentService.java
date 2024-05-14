package com.fatec.student.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.fatec.student.entities.Student;
import com.fatec.student.resources.StudentRepository;

public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }
    
}
