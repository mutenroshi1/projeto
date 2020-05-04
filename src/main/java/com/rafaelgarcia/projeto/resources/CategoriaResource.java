package com.rafaelgarcia.projeto.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rafaelgarcia.projeto.domain.Categoria;
import com.rafaelgarcia.projeto.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")

public class CategoriaResource {
	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value = "/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		Categoria obj = service.find(id);
		
		Categoria cat1 = new Categoria(1,"Comidas");
		Categoria cat2 = new Categoria(2,"Familia");
		Categoria cat3 = new Categoria(3,"Lugares");
		Categoria cat4 = new Categoria(4,"Streaming");
		List<Categoria> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
		lista.add(cat3);
		lista.add(cat4);
		return ResponseEntity.ok().body(obj);
	}
	
}
