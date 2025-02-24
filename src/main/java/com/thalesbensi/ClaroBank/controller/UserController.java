package com.thalesbensi.ClaroBank.controller;


import com.thalesbensi.ClaroBank.domain.model.User;
import com.thalesbensi.ClaroBank.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        User foundedUser = userService.findById(id);
        return ResponseEntity.ok(foundedUser);
    }

    @PostMapping()
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User userToBeCreated = userService.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(userToBeCreated);
    }

}
