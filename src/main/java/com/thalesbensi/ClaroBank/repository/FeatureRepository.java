package com.thalesbensi.ClaroBank.repository;


import com.thalesbensi.ClaroBank.domain.model.Feature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeatureRepository extends JpaRepository<Feature, Long> {
}
