package com.ecommercestructure.users.controller;

import com.ecommercestructure.users.entities.User;
import com.ecommercestructure.users.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired(required = true)
    private IUserService userService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveUser(@RequestBody User user) {
        userService.createUser(user);
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<User> findAllUsers(){
        return userService.findAllUsers();
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById (@PathVariable Long id){
        return ResponseEntity.ok(userService.findBiId(id));
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser (@PathVariable Long id){
        userService.deleteUser(id);
    }

}
