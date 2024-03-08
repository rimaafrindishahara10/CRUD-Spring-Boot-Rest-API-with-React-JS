package com.CRUD.Spring.Boot.Rest.API.with.React.JS.services;

import com.CRUD.Spring.Boot.Rest.API.with.React.JS.dao.CourseRepo;
import com.CRUD.Spring.Boot.Rest.API.with.React.JS.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseRepo courseRepo;

    @Override
    public List<Course> getAllCourses() {

        return this.courseRepo.findAll();
    }

    @Override
    public Course getOneCourse(long courseId) {

        return this.courseRepo.findById(courseId).get();
    }

    @Override
    public Course addCourse(Course course) {
        return this.courseRepo.save(course);
    }

    @Override
    public Course updateCourse(Course course, long courseId) {
        Course updatedByID = courseRepo.findById(courseId).get();

        updatedByID.setId(course.getId());
        updatedByID.setTitle(course.getTitle());
        updatedByID.setDescription(course.getDescription());


        return this.courseRepo.save(updatedByID);
    }

    @Override
    public void deleteCourse(long courseId) {
        this.courseRepo.deleteById(courseId);
    }


}

