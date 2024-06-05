package com.arquitecturajava.web2.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Examen {
	
	@Id
	private int id;
	private String asignatura;
	private double nota;
	private String texto;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Examen(int id, String asignatura, double nota, String texto) {
		super();
		this.id = id;
		this.asignatura = asignatura;
		this.nota = nota;
		this.texto = texto;
	}
	public Examen(int id) {
		super();
		this.id = id;
	}
	public Examen() {
		super();
	}
	
	
	
}
