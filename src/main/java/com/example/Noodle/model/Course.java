package com.example.Noodle.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private CourseCode code;

    @OneToMany(mappedBy = "course")
    private Set<Student> students;
}
