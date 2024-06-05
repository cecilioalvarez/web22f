package com.arquitecturajava.web2.mappers;

import com.arquitecturajava.web2.dto.ExamenDto;
import com.arquitecturajava.web2.models.Examen;

public class ExamenMapper {


	public static Examen toBo(ExamenDto examenDto) {
		
		return new Examen(examenDto.getId(),examenDto.getAsignatura(),0,examenDto.getTexto());
	}
}
