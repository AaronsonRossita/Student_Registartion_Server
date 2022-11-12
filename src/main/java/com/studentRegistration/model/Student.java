package com.studentRegistration.model;

public class Student {
    private Long id;
    private String firstName;
    private String lastName;
    private Long courseId;

    public Student(Long id, String firstName, String lastName, Long courseId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseId = courseId;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }
}
