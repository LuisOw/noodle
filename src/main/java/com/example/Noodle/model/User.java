package com.example.Noodle.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@MappedSuperclass
public class User {

    @Id
    private UUID id;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "registration")
    private String registration;

    @Column(name = "ingress_date")
    private LocalDateTime ingressDate;
}
