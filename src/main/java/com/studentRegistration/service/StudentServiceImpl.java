package com.studentRegistration.service;

import com.studentRegistration.model.Student;
import com.studentRegistration.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;


    @Override
    public Long createStudent(Student student) {
        return studentRepository.createStudent(student);
    }

    @Override
    public Student getStudentById(Long studentId) {
        return studentRepository.getStudentById(studentId);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.getAllStudents();
    }
}
