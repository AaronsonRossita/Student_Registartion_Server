package com.studentRegistration.service;

import com.studentRegistration.model.Student;

import java.util.List;

public interface StudentService {
    Long createStudent(Student student);
    Student getStudentById(Long studentId);
    List<Student> getAllStudents();
}
