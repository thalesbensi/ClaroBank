package com.thalesbensi.ClaroBank.service;

import com.thalesbensi.ClaroBank.domain.model.User;
import com.thalesbensi.ClaroBank.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User findById(@PathVariable Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Transactional
    public User createUser(@RequestBody User userToCreate) {
        if (userRepository.existsByUserAccount_AccountNumber(userToCreate.getUserAccount().getAccountNumber())) {
            throw new IllegalArgumentException("This account number already exists");
        }
        return userRepository.save(userToCreate);
    }
}
