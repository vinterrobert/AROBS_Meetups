package com.arobs.ArobsMeetups.Controllers;

import com.arobs.ArobsMeetups.Entities.User;
import com.arobs.ArobsMeetups.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(path="/", produces = "application/json")
    public List<User> getAllUsers(){

        return null;
    }

    @PostMapping(path= "/", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addUser(@RequestBody User newUser) {

        return null;
    }

    @DeleteMapping(path="/{idUser}")
    public ResponseEntity<Object> deleteUser(@PathVariable int idUser){

        return null;
    }

    @GetMapping(path="/userId{idUser}", produces = "application/json")
    public User getUserById(@PathVariable int idUser){

        return null;
    }

    @GetMapping (path = "/userEmail{email}", produces = "application/json")
    public User getUserByEmail(@PathVariable String email){

        return null;
    }



}
