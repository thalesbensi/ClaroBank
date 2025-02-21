package com.thalesbensi.ClaroBank.domain.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String userName;


    @OneToOne(cascade = CascadeType.ALL)
    private Account userAccount;

    @OneToOne(cascade = CascadeType.ALL)
    private Card userCard;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Feature> features;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<News>news;
}
