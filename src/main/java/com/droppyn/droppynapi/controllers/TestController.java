package com.droppyn.droppynapi.controllers;


import com.droppyn.droppynapi.models.Shoe;
import com.droppyn.droppynapi.models.User;
import com.droppyn.droppynapi.security.services.ShoeService;
import com.droppyn.droppynapi.security.services.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {
    private ShoeService shoes;
    private UserDetailsServiceImpl users;

    @Autowired
    public TestController(ShoeService shoes, UserDetailsServiceImpl users) {
        this.shoes = shoes;
        this.users = users;
    }

    @GetMapping("/all")
    public String allAccess() {
        return "Public Content.";
    }

    @GetMapping("/user")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public String userAccess() {
        return "User Content.";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminAccess() {
        return "Admin Board.";
    }

    @GetMapping("/allshoes")
    public Iterable<Shoe> getAll() {
        return shoes.findAll();
    }

    @GetMapping("/allusers")
    public Iterable<User> getAllUsers() {
        return users.findAll();
    }

    @PostMapping
    public Shoe addShoes(@RequestBody Shoe shoe) {
        return shoes.save(shoe);
    }
}