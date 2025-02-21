package com.thalesbensi.ClaroBank.domain.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity(name = "cards")
@Data
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String cardNumber;

    @Column(name = "available_limit", scale = 13, precision = 2, nullable = false)
    private BigDecimal cardLimit = BigDecimal.ZERO;
}
