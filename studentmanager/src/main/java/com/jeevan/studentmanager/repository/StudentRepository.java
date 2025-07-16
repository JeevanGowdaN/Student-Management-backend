package com.jeevan.studentmanager.repository;

import com.jeevan.studentmanager.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    // Additional custom queries can go here (if needed)
}
