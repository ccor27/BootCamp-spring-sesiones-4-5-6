package com.example.ejercicio3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //url: http://localhost:8080/api/saludo
    @GetMapping("/api/saludo")
    public String saludo(){
        return "Hola, este es un saludo desde la clase HelloController";
    }
}
