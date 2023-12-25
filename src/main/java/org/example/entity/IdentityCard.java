package org.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "identity_card")
public class IdentityCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String number;

    @OneToOne
    private Employee employee;
}
