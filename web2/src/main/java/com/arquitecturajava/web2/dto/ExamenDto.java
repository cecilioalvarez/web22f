package com.arquitecturajava.web2.dto;

public class ExamenDto {

	private int id;
	private String asignatura;
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
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public ExamenDto(int id, String asignatura, String texto) {
		super();
		this.id = id;
		this.asignatura = asignatura;
		this.texto = texto;
	}
	public ExamenDto() {
		super();
	}
	public ExamenDto(int id) {
		super();
		this.id = id;
	}
	
}
