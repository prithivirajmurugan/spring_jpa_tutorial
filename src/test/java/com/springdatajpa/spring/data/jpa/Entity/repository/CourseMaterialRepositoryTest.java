package com.springdatajpa.spring.data.jpa.Entity.repository;

import com.springdatajpa.spring.data.jpa.Entity.Course;
import com.springdatajpa.spring.data.jpa.Entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CourseMaterialRepositoryTest {
private CourseMaterialRepository repository;

@Autowired
    CourseMaterialRepositoryTest(CourseMaterialRepository repository) {
        this.repository = repository;
    }

    @Test
public void SaveCourseMaterial(){

    Course course = Course.builder()
            .title("DSA")
            .credit(6)
            .build();

    CourseMaterial courseMaterial = CourseMaterial.builder()
            .url("www.google.com")
            .course(course)
            .build();
    repository.save(courseMaterial);

}

@Test
public void printAllCourseMaterials(){
    List<CourseMaterial> courseMaterials = repository.findAll();
}
}