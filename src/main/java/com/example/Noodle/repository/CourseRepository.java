package com.example.Noodle.repository;

import com.example.Noodle.model.Course;
import com.example.Noodle.model.CourseCode;
import com.example.Noodle.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
    public Page<Student> findStudentsByCode(CourseCode code, Pageable pageable);
}
