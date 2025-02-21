package com.thalesbensi.ClaroBank.repository;


import com.thalesbensi.ClaroBank.domain.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
}
