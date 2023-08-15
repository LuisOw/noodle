package com.example.Noodle.dto;

import com.example.Noodle.model.Course;
import com.example.Noodle.model.CourseCode;
import org.springframework.beans.BeanUtils;

public class CourseDto {

    private String name;
    private CourseCode code;

    public static Course fromDto(CourseDto dto) {
        Course course = new Course();
        BeanUtils.copyProperties(dto, course);
        return course;
    }

    public static CourseDto toDto(Course course) {
        CourseDto courseDto = new CourseDto();
        BeanUtils.copyProperties(course, courseDto);
        return courseDto;
    }
}
