package com.example.Noodle.dto;

import com.example.Noodle.model.Student;
import org.springframework.beans.BeanUtils;

import java.util.UUID;

public class StudentDto extends UserDto {

    private CourseDto courseDto;

    public static Student fromDto(StudentDto studentDto) {
        Student student = new Student();
        BeanUtils.copyProperties(studentDto, student);
        return student;
    }

    public static StudentDto toDto(Student student) {
        StudentDto dto = new StudentDto();
        BeanUtils.copyProperties(student, dto);
        dto.courseDto = CourseDto.toDto(student.getCourse());
        return dto;
    }

}
