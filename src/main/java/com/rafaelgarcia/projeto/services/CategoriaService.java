package com.rafaelgarcia.projeto.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafaelgarcia.projeto.domain.Categoria;
import com.rafaelgarcia.projeto.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional <Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
