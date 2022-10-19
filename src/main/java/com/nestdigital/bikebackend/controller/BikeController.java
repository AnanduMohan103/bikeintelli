package com.nestdigital.bikebackend.controller;

import com.nestdigital.bikebackend.dao.BikeDao;
import com.nestdigital.bikebackend.model.BikeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BikeController {

    @Autowired
    private BikeDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addBike",consumes = "application/json",produces = "application/json")
    public String Bikeadd(@RequestBody BikeModel bike){
        System.out.println(bike.toString());
        dao.save(bike);
        return "{status:success}";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewBike")
    public List<BikeModel> viewBike(){
        return(List<BikeModel>)
                dao.findAll();
    }
}
