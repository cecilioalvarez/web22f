package com.arquitecturajava.web2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.arquitecturajava.web2.forms.ExamenNotaForm;
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
	@GetMapping("/ponernota")
	public String ponernota(Model modelo, @RequestParam int id) {
	
		Examen e= examenService.buscarUno(id);
		modelo.addAttribute("examen", e);
		return "ponernota.xhtml";

	}
	
	@PostMapping("/salvar")
	public String salvar(Model modelo, @ModelAttribute ExamenNotaForm form) {
	
		Examen e= examenService.buscarUno(form.getId());
		e.setNota(form.getNota());
		examenService.actualizar(e);
		List<Examen> lista = examenService.buscarTodos();
		modelo.addAttribute("lista", lista);

		return "listaexamenes.xhtml";

	}
	
}
