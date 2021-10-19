package com.droppyn.droppynapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class DroppynApi {

    private DroppynManager shoes;

    @Autowired
    public DroppynApi(DroppynManager shoes) {
        this.shoes = shoes;
    }

    @GetMapping("/all")
    public Iterable<Droppyn> getAll() {
        return shoes.findAll();
    }

    @GetMapping
    public Optional<Droppyn> getById(@RequestParam String index) {
        return shoes.findById(index);
    }

    @PostMapping
    public Droppyn addShoes(@RequestBody Droppyn shoe) {
        return shoes.save(shoe);
    }

    @PutMapping
    public Droppyn updateShoes(@RequestBody Droppyn shoe) {
        return shoes.save(shoe);
    }

    @DeleteMapping("/all")
    public void deleteShoes(@RequestParam String index) {
        shoes.deleteById(index);
    }
}
