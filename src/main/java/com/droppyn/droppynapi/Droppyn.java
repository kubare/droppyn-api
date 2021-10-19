package com.droppyn.droppynapi;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Document(collection = "offer")
public class Droppyn {
   // @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Id
    private String _id;
    private String brand;
    private String model;
    private LocalDate date;
    private Integer price;
    private String img;

    public Droppyn(String id, String brand, String model, LocalDate date, Integer price, String img) {
        this._id = id;
        this.brand = brand;
        this.model = model;
        this.date = date;
        this.price = price;
        this.img = img;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Droppyn() {
    }

    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
