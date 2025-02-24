package com.thalesbensi.ClaroBank.domain.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "cards")
@Data
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String cardNumber;

    @Column(name = "available_limit", scale = 2, precision = 13, nullable = false)
    private BigDecimal cardLimit = BigDecimal.ZERO;
}
