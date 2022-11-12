package com.studentRegistration.service;

import com.studentRegistration.model.Course;
import com.studentRegistration.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseRepository courseRepository;


    @Override
    public Long createCourse(Course course) {
        return courseRepository.createCourse(course);
    }

    @Override
    public Course getCourseById(Long courseId) {
        return courseRepository.getCourseById(courseId);
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.getAllCourses();
    }
}
