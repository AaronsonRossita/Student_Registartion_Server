package com.studentRegistration.service;

import com.studentRegistration.model.Course;
import com.studentRegistration.model.Student;

import java.util.List;

public interface CourseService {
    Long createCourse(Course course);
    Course getCourseById(Long courseId);
    List<Course> getAllCourses();
}
