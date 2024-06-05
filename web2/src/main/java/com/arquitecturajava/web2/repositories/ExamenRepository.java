package com.arquitecturajava.web2.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.arquitecturajava.web2.models.Examen;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class ExamenRepository {

	@Autowired
	private EntityManager em;
	
	public void insertar(Examen examen) {
		
		em.persist(examen);
	}
	@Transactional
	public void actualizar(Examen examen) {
		
		em.merge(examen);
	}
	
	public List<Examen> buscarTodos() {
		
		return em.createQuery("select e from Examen e",Examen.class).getResultList();
	}
	
	public Examen buscarUno(int id) {
		TypedQuery<Examen> consulta= em.createQuery("select e from Examen e where e.id=:id",Examen.class);
		consulta.setParameter("id", id);
		return consulta.getSingleResult();
		
		

		
	}
}
