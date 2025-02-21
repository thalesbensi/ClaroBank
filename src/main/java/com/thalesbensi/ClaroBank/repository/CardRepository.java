package com.thalesbensi.ClaroBank.repository;


import com.thalesbensi.ClaroBank.domain.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {
}
