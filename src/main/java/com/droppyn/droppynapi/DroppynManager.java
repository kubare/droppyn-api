package com.droppyn.droppynapi;

import java.time.LocalDate;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class DroppynManager {

    private DroppynRepo droppynRepo;

    @Autowired
    public DroppynManager(DroppynRepo droppynRepo) {
        this.droppynRepo = droppynRepo;
    }

    public Optional<Droppyn> findById(String id) {
        return droppynRepo.findById(id);
    }

    public Iterable<Droppyn> findAll() {
        return droppynRepo.findAll();
    }

    public Droppyn save(Droppyn shoe) {
        return droppynRepo.save(shoe);
    }

    public void deleteById(String id) {
        droppynRepo.deleteById(id);
    }

  /*  @EventListener(ApplicationReadyEvent.class)
    public void fillDB() {
        save(new Droppyn(1L, "Nike", "Air Jordan 4 Bred", LocalDate.of(2021, 4, 19), 199, "https://i.ibb.co/L5r8L7J/Air-Jordan-4-Retro-Black-Cement-2019-Product.jpg"));
        save(new Droppyn(2L, "Nike", "Dunk Low", LocalDate.of(2021, 6, 11), 225, "https://i.ibb.co/vwnWKdw/dunk.webp"));
        save(new Droppyn(3L, "Nike", "Jordan 1 Black Toe", LocalDate.of(2021, 3, 02), 185, "https://i.ibb.co/HhCV0LG/js1.webp"));
        save(new Droppyn(4L, "Asisc", "Gel Lite 3 Koi", LocalDate.of(2021, 12, 22), 120, "https://i.ibb.co/bj0txGZ/asisc.webp"));
        save(new Droppyn(5L, "Adidas", "Yeezy Boost 350v2", LocalDate.of(2021, 11, 02), 250, "https://i.ibb.co/pR3jyjg/yzy350.webp"));
        save(new Droppyn(6L, "Nike", "Flyknit Trainer Oreo", LocalDate.of(2021, 4, 19), 199, "https://i.ibb.co/qY5fp2f/Nike-Flyknit-Trainer-Oreo-Product.webp"));
        save(new Droppyn(7L, "Nike", "Flyknit Trainer Sunset", LocalDate.of(2021, 6, 11), 225, "https://i.ibb.co/M9GD1Ls/sunset.webp"));
        save(new Droppyn(8L, "Adidas", "Ultraboost 1.0 OG", LocalDate.of(2021, 3, 02), 185, "https://i.ibb.co/Y8VrV9q/ub.webp"));
        save(new Droppyn(9L, "Nike", "Air Force 1", LocalDate.of(2021, 12, 22), 120, "https://i.ibb.co/bmCr5MH/af1hello.jpg"));
        save(new Droppyn(10L, "Nike", "Air Force 1 x Supreme", LocalDate.of(2021, 11, 02), 250, "https://i.ibb.co/9rPV8Rt/af1.webp"));
        save(new Droppyn(11L, "Nike", "Air Jordan 4 Bred", LocalDate.of(2021, 4, 19), 199, "https://i.ibb.co/L5r8L7J/Air-Jordan-4-Retro-Black-Cement-2019-Product.jpg"));
        save(new Droppyn(12L, "Nike", "Dunk Low", LocalDate.of(2021, 6, 11), 225, "https://i.ibb.co/vwnWKdw/dunk.webp"));
        save(new Droppyn(13L, "Nike", "Jordan 1 Black Toe", LocalDate.of(2021, 3, 02), 185, "https://i.ibb.co/HhCV0LG/js1.webp"));
        save(new Droppyn(14L, "Asisc", "Gel Lite 3 Koi", LocalDate.of(2021, 12, 22), 120, "https://i.ibb.co/bj0txGZ/asisc.webp"));
        save(new Droppyn(15L, "Adidas", "Yeezy Boost 350v2", LocalDate.of(2021, 11, 02), 250, "https://i.ibb.co/pR3jyjg/yzy350.webp"));
        save(new Droppyn(16L, "Nike", "Flyknit Trainer Oreo", LocalDate.of(2021, 4, 19), 199, "https://i.ibb.co/qY5fp2f/Nike-Flyknit-Trainer-Oreo-Product.webp"));
        save(new Droppyn(17L, "Nike", "Flyknit Trainer Sunset", LocalDate.of(2021, 6, 11), 225, "https://i.ibb.co/M9GD1Ls/sunset.webp"));
        save(new Droppyn(18L, "Adidas", "Ultraboost 1.0 OG", LocalDate.of(2021, 3, 02), 185, "https://i.ibb.co/Y8VrV9q/ub.webp"));
        save(new Droppyn(19L, "Nike", "Air Force 1", LocalDate.of(2021, 12, 22), 120, "https://i.ibb.co/bmCr5MH/af1hello.jpg"));
        save(new Droppyn(20L, "Nike", "Air Force 1 x Supreme", LocalDate.of(2021, 11, 02), 250, "https://i.ibb.co/9rPV8Rt/af1.webp"));
    } */
}
