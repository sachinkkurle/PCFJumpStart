package com.spring.learn.swagger.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.learn.swagger.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}