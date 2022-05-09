package com.springdatajpa.spring.data.jpa.Entity.repository;

import com.springdatajpa.spring.data.jpa.Entity.Course;
import com.springdatajpa.spring.data.jpa.Entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherRepositoryTest {
    @Autowired
    private TeacherRepository teacherRepository;

    public void saveTeacher(){

        Course courseDBA = Course.builder()
                .title("DBA")
                .credit(5)
                .build();

        Course courseJava = Course.builder()
                .title("Java")
                .credit(6)
                .build();

        Teacher teacher =
                Teacher.builder()
                        .firstName("Qutub")
                        .lastName("Khan")
                        .courses(List.of(courseDBA,courseJava))
                        .build();

        teacherRepository.save(teacher);
    }

}