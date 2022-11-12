package com.studentRegistration.repository;

import com.studentRegistration.model.Student;
import com.studentRegistration.repository.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private static final String STUDENT_TABLE_NAME = "student";

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public Long createStudent(Student student) {
        String sql = "INSERT INTO " + STUDENT_TABLE_NAME + " (first_name, last_name, course_id) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, student.getFirstName(), student.getLastName(), student.getCourseId());
        return jdbcTemplate.queryForObject("SELECT LAST_INSERT_ID();", Long.class);
    }

    @Override
    public Student getStudentById(Long studentId) {
        String sql = "SELECT * FROM " + STUDENT_TABLE_NAME + " WHERE id=?";
        try {
            return jdbcTemplate.queryForObject(sql, new StudentMapper(), studentId);
        } catch (EmptyResultDataAccessException error){
            return null;
        }
    }

    @Override
    public List<Student> getAllStudents() {
        String sql = "SELECT * FROM " + STUDENT_TABLE_NAME;
        try {
            return jdbcTemplate.query(sql, new StudentMapper());
        } catch (EmptyResultDataAccessException error){
            return null;
        }
    }
}
