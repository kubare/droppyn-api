package com.droppyn.droppynapi.controllers;

import com.droppyn.droppynapi.models.User;
import com.droppyn.droppynapi.security.services.ShoeService;
import com.droppyn.droppynapi.models.Shoe;
import com.droppyn.droppynapi.security.services.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/shoes")
@CrossOrigin(origins = "*", maxAge = 3600)
public class ShoeController {

    @Autowired
    private ShoeService shoes;
    private UserDetailsServiceImpl users;

    @Autowired
    public ShoeController(ShoeService shoes, UserDetailsServiceImpl users) {
        this.shoes = shoes;
        this.users = users;
    }

    @GetMapping("/listshoes")
    @PreAuthorize("hasRole('ADMIN')")
    public Iterable<Shoe> getAll() {
        return shoes.findAll();
    }

    @GetMapping("/listusers")
    public Iterable<User> getAllUsers() {
        return users.findAll();
    }

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public Optional<Shoe> getById(@RequestParam String index) {
        return shoes.findById(index);
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public Shoe addShoes(@RequestBody Shoe shoe) {
        return shoes.save(shoe);
    }

    @PutMapping
    @PreAuthorize("hasRole('ADMIN')")
    public Shoe updateShoes(@RequestBody Shoe shoe) {
        return shoes.save(shoe);
    }

    @DeleteMapping("/adminshoes")
    @PreAuthorize("hasRole('ADMIN')")
    public void deleteShoes(@RequestParam String index) {
        shoes.deleteById(index);
    }
}
