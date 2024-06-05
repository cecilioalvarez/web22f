package com.arquitecturajava.web2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.arquitecturajava.web2.models.Examen;
import com.arquitecturajava.web2.repositories.ExamenRepository;
@Service
public class ExamenService {

	@Autowired
	private ExamenRepository examenRepository;

	@Transactional
	public void insertar(Examen examen) {
		examenRepository.insertar(examen);
	}

	@Transactional
	public void actualizar(Examen examen) {
		examenRepository.actualizar(examen);
	}

	public List<Examen> buscarTodos() {
		return examenRepository.buscarTodos();
	}

	public Examen buscarUno(int id) {
		return examenRepository.buscarUno(id);
	}
	
	
}
