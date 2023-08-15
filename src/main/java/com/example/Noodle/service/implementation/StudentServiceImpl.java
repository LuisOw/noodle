package com.example.Noodle.service.implementation;

import com.example.Noodle.dto.StudentDto;
import com.example.Noodle.model.Student;
import com.example.Noodle.repository.StudentRepository;
import com.example.Noodle.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Slf4j
public class StudentServiceImpl implements UserService<Student, StudentDto> {

    @Autowired
    private StudentRepository repository;

    @Override
    public Page<StudentDto> getUser(Pageable pageable) {
        var studentsPage = repository.findAll(pageable);
        return new PageImpl<>(studentsPage.stream().map(StudentDto::toDto).toList(),
                studentsPage.getPageable(), studentsPage.getNumberOfElements());
    }

    @Override
    @Transactional
    public StudentDto createUser(StudentDto userDto) {
        var student = StudentDto.fromDto(userDto);
        return StudentDto.toDto(repository.save(student));
    }

}
