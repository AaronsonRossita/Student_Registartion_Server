package com.studentRegistration.controller;

import com.studentRegistration.model.Course;
import com.studentRegistration.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    CourseService courseService;

    @PostMapping(value = "/create}")
    @CrossOrigin
    public Long createCourse(@RequestBody Course course){
       return courseService.createCourse(course);
    }

    @GetMapping(value = "/{courseId}")
    public Course getCourseById(@PathVariable Long courseId){
        return courseService.getCourseById(courseId);
    }

    @CrossOrigin
    @GetMapping(value = "/all")
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }
}
