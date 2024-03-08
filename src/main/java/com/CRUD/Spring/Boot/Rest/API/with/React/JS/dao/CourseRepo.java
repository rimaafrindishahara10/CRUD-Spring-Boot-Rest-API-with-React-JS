package com.CRUD.Spring.Boot.Rest.API.with.React.JS.dao;

import com.CRUD.Spring.Boot.Rest.API.with.React.JS.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Course,Long> {

}
