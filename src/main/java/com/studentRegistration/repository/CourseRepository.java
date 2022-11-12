package com.studentRegistration.repository;

import com.studentRegistration.model.Course;

import java.util.List;

public interface CourseRepository {
    Long createCourse(Course course);
    Course getCourseById(Long courseId);
    List<Course> getAllCourses();
}
