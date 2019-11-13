package com.juanmello.projectspringboot.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juanmello.projectspringboot.domain.Categoria;
import com.juanmello.projectspringboot.repositories.CategoriaRepository;
import com.juanmello.projectspringboot.services.exception.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
	
	public Categoria insert (Categoria obj) {
		obj.setId(null);
		return repo.save(obj);
	}
}
