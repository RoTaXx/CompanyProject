package org.example.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private LocalDate foundationDate;

    private double initialCapital;

    @OneToMany(mappedBy = "company")
    private Set<Employee> employees;

    public Company() {
    }

    public Company(String name, LocalDate foundationDate, double initialCapital) {
        this.name = name;
        this.foundationDate = foundationDate;
        this.initialCapital = initialCapital;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", foundationDate=" + foundationDate +
                ", initialCapital=" + initialCapital +
                '}';
    }
}
