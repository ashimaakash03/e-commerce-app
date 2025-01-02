package com.fullstack.backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Table(name = "addresses")
@Entity
public class Address {

    @Column(name = "created_at")
    private final LocalDateTime createdAt = LocalDateTime.now();
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String flatNumber;
    private String societyName;
    private String residenceArea;
    private String city;
    private String state;
    private String country;
    private String zipCode;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_Id")
    private User user;
}
