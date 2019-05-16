package com.java.br.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.br.Model.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> listar() {
		
		Categoria cat1 = new Categoria(1,"Informática");
		Categoria cat2 = new Categoria(2,"Escitório");
		
		List<Categoria> listar = new ArrayList<>();
		
		listar.add(cat1);
		listar.add(cat2);
		
		return listar;
	}

}
