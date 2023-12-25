package org.example.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @ManyToOne
    private Company company;

    @ManyToMany(mappedBy = "employees")
    private Set<CompanyEvent> companyEvents;
    @OneToOne(mappedBy = "employee")
    private IdentityCard identityCard;
}
