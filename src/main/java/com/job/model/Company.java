package com.job.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

//    @Column(name = "user_id", nullable = false)
//    private User userId;

    @Column(name = "name", nullable = false)
    private String name;
}
