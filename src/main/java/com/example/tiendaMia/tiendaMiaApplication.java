package com.example.tiendaMia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class tiendaMiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(tiendaMiaApplication.class, args);
	}
	@CrossOrigin(origins = "http://localhost:8080/restaurantesr/api/")
	@GetMapping("/**")
	public ResponseEntity<?> obtenerTodos() {
		return null;
	}
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("*");
			}
		};
	}
}
