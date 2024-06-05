package com.arquitecturajava.web2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.arquitecturajava.web2.models.Examen;
import com.arquitecturajava.web2.repositories.ExamenRepository;

public class ExamenService {

	@Autowired
	private ExamenRepository examenRepository;

	public void insertar(Examen examen) {
		examenRepository.insertar(examen);
	}

	public void actualizar(Examen examen) {
		examenRepository.actualizar(examen);
	}

	public List<Examen> buscarTodos() {
		return examenRepository.buscarTodos();
	}
	
	
}
