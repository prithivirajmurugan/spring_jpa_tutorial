package com.springdatajpa.spring.data.jpa.Entity.repository;

import com.springdatajpa.spring.data.jpa.Entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseRepositoryTest {

    @Autowired
    private CourseRepository courseRepository;

    public void printCourses(){
        List<Course> courses = courseRepository.findAll();
    }
}