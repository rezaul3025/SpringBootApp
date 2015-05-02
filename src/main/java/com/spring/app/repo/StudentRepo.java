package com.spring.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.app.core.domain.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
