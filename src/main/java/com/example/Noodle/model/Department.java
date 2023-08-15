package com.example.Noodle.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private DepartmentCode code;

    @OneToMany(mappedBy = "department")
    private Set<Professor> professors;
}
