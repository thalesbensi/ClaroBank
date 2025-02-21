package com.thalesbensi.ClaroBank.repository;


import com.thalesbensi.ClaroBank.domain.model.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends JpaRepository<News, Long> {
}
