package com.example.Noodle.controller;

import com.example.Noodle.dto.StudentDto;
import com.example.Noodle.service.implementation.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentController {

    @Autowired
    private StudentServiceImpl service;

    @GetMapping(value = "/student")
    public ResponseEntity<Page<StudentDto>> getStudents(Pageable pageable) {
        var students = service.getUser(pageable);
        return ResponseEntity.ok(students);
    }

    @PostMapping(value = "/student")
    public ResponseEntity<StudentDto> postStudent(@RequestBody StudentDto studentDto) {
        var student = service.createUser(studentDto);
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }
}
