package com.rafaelgarcia.projeto;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rafaelgarcia.projeto.domain.Categoria;
import com.rafaelgarcia.projeto.repositories.CategoriaRepository;

@SpringBootApplication
public class ProjetoApplication implements CommandLineRunner {
	@Autowired
	private CategoriaRepository categoriaRepository;
	public static void main(String[] args) {
		SpringApplication.run(ProjetoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Categoria cat1 = new Categoria(null,"Inforática");
		Categoria cat2 = new Categoria(null,"Escritório");
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
	}

}
