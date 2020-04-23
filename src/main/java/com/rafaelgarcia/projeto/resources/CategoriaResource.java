package com.rafaelgarcia.projeto.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rafaelgarcia.projeto.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")

public class CategoriaResource {
	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar() {
		Categoria cat1 = new Categoria(1,"Comidas");
		Categoria cat2 = new Categoria(2,"Amigos");
		Categoria cat3 = new Categoria(3,"Lugares");
		Categoria cat4 = new Categoria(4,"Netflix");
		List<Categoria> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
		lista.add(cat3);
		lista.add(cat4);
		return lista;
	}
	
}
