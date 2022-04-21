package com.example.ejercicio3;

import com.example.ejercicio3.entity.Laptop;
import com.example.ejercicio3.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo {



	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Demo.class, args);
		LaptopRepository laptopRepository = context.getBean(LaptopRepository.class);

		//creacion de laptos y almacenacion en la base de datos

		Laptop laptop1 = new Laptop(null,"asus","intel",8);
		Laptop laptop2 = new Laptop(null,"hp","amd",4);
		Laptop laptop3 = new Laptop(null,"sonic","intel",16);
		laptopRepository.save(laptop1);
		laptopRepository.save(laptop2);
		laptopRepository.save(laptop3);

	}

}
