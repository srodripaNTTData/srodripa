package com.example.Bootcampdia2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Bootcampdia2.Facade.Person20;

@SpringBootApplication
public class Bootcampdia2Application {

	public static void main(String[] args) {
		SpringApplication.run(Bootcampdia2Application.class, args);
		
		Person20 Manolo20 = new Person20("Manolo");
		System.out.println(Manolo20.verDetalle());
	}

}
