package com.example.ejercicio3.controller;

import com.example.ejercicio3.entity.Laptop;
import com.example.ejercicio3.repository.LaptopRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LaptopController {

    private LaptopRepository laptopRepository;

    public LaptopController(LaptopRepository laptopRepository){
        this.laptopRepository=laptopRepository;
    }
    //url: http://localhost:8080/api/laptos
    @GetMapping("/api/laptops")
    public List<Laptop> findAll(){
        return laptopRepository.findAll();
    }

    //url: http://localhost:8080/api/save
    @PostMapping("/api/save")
    public Laptop save(@RequestBody Laptop laptop){
        return laptopRepository.save(laptop);
    }
}
