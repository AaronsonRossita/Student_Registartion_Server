package com.studentRegistration.repository;

import com.studentRegistration.model.Student;

import java.util.List;

public interface StudentRepository {
    Long createStudent(Student student);
    Student getStudentById(Long studentId);
    List<Student> getAllStudents();
}
