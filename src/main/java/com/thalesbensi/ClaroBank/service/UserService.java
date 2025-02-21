package com.thalesbensi.ClaroBank.service;

import com.thalesbensi.ClaroBank.domain.model.User;
import com.thalesbensi.ClaroBank.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
          return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @PostMapping()
    public User createUser(@RequestBody User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getUserAccount().getAccountNumber())) {
            throw new IllegalArgumentException("This Account number already exists");
        }
        return userRepository.save(userToCreate);
    }
}
