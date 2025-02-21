package com.thalesbensi.ClaroBank.repository;


import com.thalesbensi.ClaroBank.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
