package com.example.Noodle.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@Entity
@Table(name = "student")
@EqualsAndHashCode(callSuper = true)
public class Student extends User {

    @ManyToOne
    @JoinColumn(name = "fk_course_id", nullable = false)
    private Course course;

}
