package com.fullstack.backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Table(name = "payments")
@Entity
public class Payment {

    @Column(name = "created_at")
    private final LocalDateTime createdAt = LocalDateTime.now();
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal amount;
    private String method;
    private String status;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;
}
