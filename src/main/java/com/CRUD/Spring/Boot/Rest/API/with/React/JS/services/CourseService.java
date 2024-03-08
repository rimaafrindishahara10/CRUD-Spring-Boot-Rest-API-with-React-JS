package com.CRUD.Spring.Boot.Rest.API.with.React.JS.services;

import com.CRUD.Spring.Boot.Rest.API.with.React.JS.entities.Course;


import java.util.List;

public interface CourseService {


    public List<Course> getAllCourses();

    public Course getOneCourse(long courseId);

    public  Course addCourse(Course course);

    public Course updateCourse(Course course, long courseId);

    public void deleteCourse(long courseId);

}
