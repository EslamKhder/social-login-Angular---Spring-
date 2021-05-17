package com.spring.social.controller;

import com.spring.social.model.Student;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

// http://localhost:8080
@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
// http://localhost:8080/api
public class TestingController {

    private List<Student> students = new ArrayList<>();

    @PostConstruct
    public void init(){
        students.add(new Student(1L,"Eslam","10"));
        students.add(new Student(1L,"ahmed","20"));
        students.add(new Student(1L,"Jo","15"));
        students.add(new Student(1L,"yaser","17"));
        students.add(new Student(1L,"karim","25"));
    }
    // http://localhost:8080/api/students
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return students;
    }
}
