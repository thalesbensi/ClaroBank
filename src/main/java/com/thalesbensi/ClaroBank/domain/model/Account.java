package com.thalesbensi.ClaroBank.domain.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "accounts")
@Data
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String accountNumber;

    @Column(nullable = false)
    private String agencyNumber;

    @Column(scale = 5, precision = 17, nullable = false)
    private BigDecimal accountBalance = BigDecimal.ZERO;

    @Column(name = "additional_limit", scale = 5, precision = 17, nullable = false)
    private BigDecimal accountLimit = BigDecimal.ZERO;
}
