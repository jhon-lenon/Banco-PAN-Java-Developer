package me.dio.academia.digital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.tryingsboot.controller"})
public class AcademiaDigitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcademiaDigitalApplication.class, args);
	}

}
