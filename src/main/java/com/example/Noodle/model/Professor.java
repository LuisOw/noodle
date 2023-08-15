package com.example.Noodle.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "professor")
@EqualsAndHashCode(callSuper = true)
public class Professor extends User {

    @ManyToOne
    @JoinColumn(name = "fk_department_id")
    private Department department;
}
