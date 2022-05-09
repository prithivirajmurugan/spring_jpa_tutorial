package com.springdatajpa.spring.data.jpa.Entity.repository;

import com.springdatajpa.spring.data.jpa.Entity.CourseMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseMaterialRepository extends JpaRepository<CourseMaterial,Long> {
}
