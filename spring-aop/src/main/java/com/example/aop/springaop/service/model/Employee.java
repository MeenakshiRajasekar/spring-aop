package com.example.aop.springaop.service.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    }
