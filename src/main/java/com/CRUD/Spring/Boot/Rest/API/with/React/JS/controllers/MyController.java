package com.CRUD.Spring.Boot.Rest.API.with.React.JS.controllers;

import com.CRUD.Spring.Boot.Rest.API.with.React.JS.entities.Course;
import com.CRUD.Spring.Boot.Rest.API.with.React.JS.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private CourseService courseService;

    //Get-All Courses:
    @GetMapping("/courses/")
    public List<Course> getAllCourses(){
        return this.courseService.getAllCourses() ;
    }

    //Get-One Course:
    @GetMapping("/courses/{courseId}")
    public Course getOneCourse(@PathVariable long courseId){

        return this.courseService.getOneCourse(courseId);
    }

    //Post-Add Course:
    @PostMapping("/courses/")
    public Course addCourse(@RequestBody Course course){

        return this.courseService.addCourse(course);
    }

    //Put-Update Course:
    @PutMapping("/courses/{courseId}")
    public Course updateCourse(@RequestBody Course course , @PathVariable long courseId){

       return this.courseService.updateCourse(course,courseId);
    }

    //Delete-One Course:
    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable long courseId){

        try {
            this.courseService.deleteCourse(courseId);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (Exception e){
             return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

        }


    }









}
