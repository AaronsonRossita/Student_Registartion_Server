package com.studentRegistration.repository;

import com.studentRegistration.model.Course;
import com.studentRegistration.repository.mapper.CourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CourseRepositoryImpl implements CourseRepository {

    private static final String COURSE_TABLE_NAME = "course";

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public Long createCourse(Course course) {
        String sql = "INSERT INTO " + COURSE_TABLE_NAME + " (name, start_date) VALUES (?, ?)";
        jdbcTemplate.update(sql, course.getName(), course.getStartDate());
        return jdbcTemplate.queryForObject("SELECT LAST_INSERT_ID();", Long.class);
    }

    @Override
    public Course getCourseById(Long courseId) {
        String sql = "SELECT * FROM " + COURSE_TABLE_NAME + " WHERE id=?";
        try {
            return jdbcTemplate.queryForObject(sql, new CourseMapper(), courseId);
        } catch (EmptyResultDataAccessException error){
            return null;
        }
    }

    @Override
    public List<Course> getAllCourses() {
        String sql = "SELECT * FROM " + COURSE_TABLE_NAME;
        try {
            return jdbcTemplate.query(sql, new CourseMapper());
        } catch (EmptyResultDataAccessException error){
            return null;
        }
    }
}
