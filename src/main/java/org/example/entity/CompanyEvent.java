package org.example.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "company_event")
public class CompanyEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @ManyToMany
    private Set<Employee> employees;
}
