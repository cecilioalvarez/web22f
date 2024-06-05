package com.arquitecturajava.web2.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arquitecturajava.web2.dto.ExamenDto;
import com.arquitecturajava.web2.mappers.ExamenMapper;
import com.arquitecturajava.web2.services.ExamenService;

@RestController
@RequestMapping("/webapi/examenes")
public class ExamenRestController {

	
	@Autowired
	private ExamenService examenService;
	@PostMapping
	public void insertar(ExamenDto examen) {
		
		examenService.insertar(ExamenMapper.toBo(examen));
	}

	
}
