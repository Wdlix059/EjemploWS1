package com.jp.clase.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jp.clase.controllers.dao.IDBTecnicos;
import com.jp.clase.controllers.entity.Tecnicos;
import com.jp.clase.controllers.interfaces.ITecnicos;

@RestController
@RequestMapping(value = "/tecnico")
public class TecnicosController {
	
	@Autowired
	private ITecnicos tecnicos;
	
	@Autowired
	private IDBTecnicos tecnicosdao;
	
	@GetMapping(value = "/getMensaje", produces = MediaType.TEXT_PLAIN_VALUE)
	public String getMensaje(@RequestHeader("estudiante") String estudiante) {
		return "Hola otra vez: "+ estudiante;
	}
	
	@GetMapping(value = "/getTecnicos", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Tecnicos> getTecnicos() {
		return tecnicosdao.findAll();
	}
	
	@PostMapping(value = "/saveTecnico", consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.TEXT_PLAIN_VALUE)
	public String saveTecnico(@RequestBody Tecnicos tecnico) {
		int id = tecnicosdao.save(tecnico);
		return "Registro creado con id: " +id;
	}
	
	@PutMapping(value = "/updateTecnico/{idtecnicos}")
	public Tecnicos updateTecnico(@PathVariable("idtecnicos") int idTecnicos, 
			@RequestBody Tecnicos tecnico) {
		return tecnicos.update(idTecnicos, tecnico);
	}
}
