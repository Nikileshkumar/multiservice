package com.encora.college.repo;

import com.encora.college.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentServiceRepository extends JpaRepository<Student, String> {
    List<Student> findByDepartmentId(String departmentId);
    @Query("")
    Student findByStudentName(String studentName);
}
