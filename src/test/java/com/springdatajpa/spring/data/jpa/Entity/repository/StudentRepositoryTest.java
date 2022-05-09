package com.springdatajpa.spring.data.jpa.Entity.repository;

import com.springdatajpa.spring.data.jpa.Entity.Guardian;
import com.springdatajpa.spring.data.jpa.Entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//@DataJpaTest // Ideally should this should be used
@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent(){

        Student student = Student.builder()
                .emailId("prithivirajm@gmail.com")
                .firstName("Prithiviraj")
                .lastName("Murugan")
                //.guardianName("Murugan")
                //.guardianEmail("murugan@gmail.com")
                //.guardianMobile("999999999")
                .build();
        studentRepository.save(student);
    }

    public void saveStudentWithGuardian(){
        Guardian guardian = Guardian.builder()
                .name("Nikhil")
                .email("Nikhil@gmai.com")
                .mobile("99999999999")
                .build();
        Student student = Student.builder()
                .firstName("Shivam")
                .lastName("shivam@gmail.com")
                .guardian(guardian)
                .build();
    }

    @Test
    public void printAllStudent(){
        List<Student> studentList = studentRepository.findAll();
        System.out.println("studentList = "+ studentList);
    }

    @Test
    public void printStudentByFirstName(){
        List<Student> students = studentRepository.findByFirstName("shivam");
        System.out.println("students = " + students);
    }
    @Test
    public void printStudentByFirstNameContaining(){
        List<Student> students = studentRepository.findByFirstName("sh");
        System.out.println("students = " + students);
    }

    @Test
    public void printStudentByGuardianName(){
        List<Student> students = studentRepository.findByGuardianName("Nikhil");
        System.out.println("students = " + students);
    }

    public void printgetStudenByEmailAddress(){
        Student student = studentRepository.getStudentByEmailAddress("shivam@gmail.com");
    }
}