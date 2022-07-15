package com.sofka.ExamenNivelacion;

import com.sofka.ExamenNivelacion.models.Ciclista;
import com.sofka.ExamenNivelacion.repositories.CiclistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExamenNivelacionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamenNivelacionApplication.class, args);
	}

}
