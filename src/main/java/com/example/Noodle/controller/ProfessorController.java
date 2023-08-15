package com.example.Noodle.controller;

import com.example.Noodle.dto.ProfessorDto;
import com.example.Noodle.dto.StudentDto;
import com.example.Noodle.service.implementation.ProfessorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProfessorController {

    @Autowired
    private ProfessorServiceImpl service;

    @GetMapping(value = "/professor")
    public ResponseEntity<List<ProfessorDto>> getProfessors(Pageable pageable) {
        return null;
    }

    @PostMapping(value = "/professor")
    public ResponseEntity<ProfessorDto> postStudent(@RequestBody ProfessorDto professorDto) {
        var professor = service.createUser(studentDto);
        return new ResponseEntity<>(professor, HttpStatus.CREATED);
    }
}
