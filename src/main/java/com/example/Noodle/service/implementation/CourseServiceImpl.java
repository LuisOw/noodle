package com.example.Noodle.service.implementation;

import com.example.Noodle.dto.CourseDto;
import com.example.Noodle.model.Course;
import com.example.Noodle.model.CourseCode;
import com.example.Noodle.model.Student;
import com.example.Noodle.repository.CourseRepository;
import com.example.Noodle.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
@Slf4j
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository repository;

    @Override
    public List<Course> getCourses() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public CourseDto postCourse(CourseDto courseDto) {
        log.info("Saving Course {}", courseDto);
        Course course = CourseDto.fromDto(courseDto);
        return CourseDto.toDto(repository.save(course));
    }

//    @Override
//    public Page<Student> getStudentsByCourse(CourseCode code, Pageable pageable) {
//        //Currently using default page sort. Refactor to use popular 2-query method
//        return repository.findStudentsByCode(code, pageable).stream().map();
//    }
}
