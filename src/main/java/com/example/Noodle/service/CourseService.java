package com.example.Noodle.service;

import com.example.Noodle.dto.CourseDto;
import com.example.Noodle.model.Course;
import com.example.Noodle.model.CourseCode;
import com.example.Noodle.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CourseService {
    public List<Course> getCourses();
    public CourseDto postCourse(CourseDto courseDto);
//    public Page<Student> getStudentsByCourse(CourseCode code, Pageable pageable);
}
