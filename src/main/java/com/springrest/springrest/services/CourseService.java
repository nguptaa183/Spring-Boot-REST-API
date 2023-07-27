package com.springrest.springrest.services;

import com.springrest.springrest.entities.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourses();

    public Course getCourseByID(long courseID);

    public Course insertCourse(Course course);

    public Course updateCourse(Course course);

    public String deleteCourseByID(long courseID);
}
