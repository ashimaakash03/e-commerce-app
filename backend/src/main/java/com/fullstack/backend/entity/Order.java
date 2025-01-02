package com.fullstack.backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Table(name = "orders")
@Entity
public class Order {
    @Column(name = "created_at")
    private final LocalDateTime createdAt = LocalDateTime.now();
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "order", orphanRemoval = true)
    List<OrderItem> orderItems;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal totalPrice;
}
