package com.droppyn.droppynapi.controllers;

import com.droppyn.droppynapi.security.services.ShoeService;
import com.droppyn.droppynapi.models.Shoe;
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

    @Autowired
    public ShoeController(ShoeService shoes) {
        this.shoes = shoes;
    }

    @GetMapping("/list")
    @PreAuthorize("hasRole('ADMIN')")
    public Iterable<Shoe> getAll() {
        return shoes.findAll();
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
