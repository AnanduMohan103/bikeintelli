package com.nestdigital.bikebackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bike")
public class BikeModel {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private  String brand;
    private String colour;
    private int price;

    public BikeModel() {
    }

    public BikeModel(int id, String name, String brand, String colour, int price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.colour = colour;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
