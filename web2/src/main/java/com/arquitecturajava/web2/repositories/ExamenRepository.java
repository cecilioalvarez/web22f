package com.arquitecturajava.web2.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.arquitecturajava.web2.models.Examen;

import jakarta.persistence.EntityManager;

@Repository
public class ExamenRepository {

	@Autowired
	private EntityManager em;
	
	public void insertar(Examen examen) {
		
		em.persist(examen);
	}
	
	public void actualizar(Examen examen) {
		
		em.merge(examen);
	}
	
	public List<Examen> buscarTodos() {
		
		return em.createQuery("select e from Examen e",Examen.class).getResultList();
	}
}
