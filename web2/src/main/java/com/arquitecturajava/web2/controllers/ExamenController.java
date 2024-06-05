package com.arquitecturajava.web2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.arquitecturajava.web2.models.Examen;
import com.arquitecturajava.web2.services.ExamenService;

@Controller
public class ExamenController {

	
	@Autowired
	private ExamenService examenService;
	
	@GetMapping("/listaexamenes")
	public String listaexamenes(Model modelo) {
		List<Examen> lista = examenService.buscarTodos();

		// asigna a la plantilla una nombre de lista junto con los datos
		modelo.addAttribute("lista", lista);

		return "listaexamenes.xhtml";

	}
	
}
