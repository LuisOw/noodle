package com.example.Noodle.controller;

import com.example.Noodle.dto.CourseDto;
import com.example.Noodle.dto.StudentDto;
import com.example.Noodle.model.Course;
import com.example.Noodle.model.CourseCode;
import com.example.Noodle.service.implementation.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Pageable;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseServiceImpl service;


    @GetMapping(value = "/course")
    public ResponseEntity<List<CourseDto>> getCourses() {
        List<Course> courses = service.getCourses();
        List<CourseDto> dtoList = courses.stream().map(CourseDto::toDto).toList();
        return ResponseEntity.ok(dtoList);
    }

    @PostMapping(value = "/course")
    public ResponseEntity<CourseDto> postCourse(@RequestBody CourseDto courseDto) {
        CourseDto course = service.postCourse(courseDto);
        return new ResponseEntity<>(course, HttpStatus.CREATED);
    }

//    @GetMapping("/{code}")
//    public ResponseEntity<Page<StudentDto>> getStudentsFromCourse(@PathVariable CourseCode code, Pageable pageable) {
//        var students = service.getStudentsByCourse(code, pageable);
//        return ResponseEntity.ok(students);
//    }
}
