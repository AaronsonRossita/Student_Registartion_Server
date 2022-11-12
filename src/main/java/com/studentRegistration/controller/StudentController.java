package com.studentRegistration.controller;

import com.studentRegistration.model.Student;
import com.studentRegistration.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @CrossOrigin
    @PostMapping(value = "/create")
    public Long createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    @GetMapping(value = "student/{studentId}")
    public Student getStudentById(@PathVariable Long studentId){
        return studentService.getStudentById(studentId);
    }

    @CrossOrigin
    @GetMapping(value = "/all")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
}
