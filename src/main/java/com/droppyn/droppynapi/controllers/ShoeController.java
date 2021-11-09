package com.droppyn.droppynapi.controllers;

import com.droppyn.droppynapi.security.services.ShoeService;
import com.droppyn.droppynapi.models.Shoe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ShoeController {

    private ShoeService shoes;

    @Autowired
    public ShoeController(ShoeService shoes) {
        this.shoes = shoes;
    }

    @GetMapping("/all")
    public Iterable<Shoe> getAll() {
        return shoes.findAll();
    }

    @GetMapping
    public Optional<Shoe> getById(@RequestParam String index) {
        return shoes.findById(index);
    }

    @PostMapping
    public Shoe addShoes(@RequestBody Shoe shoe) {
        return shoes.save(shoe);
    }

    @PutMapping
    public Shoe updateShoes(@RequestBody Shoe shoe) {
        return shoes.save(shoe);
    }

    @DeleteMapping("/all")
    public void deleteShoes(@RequestParam String index) {
        shoes.deleteById(index);
    }
}
