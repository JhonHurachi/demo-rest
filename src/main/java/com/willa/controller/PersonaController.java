package com.willa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.willa.model.Persona;
import com.willa.service.PersonaService;

@RestController
@RequestMapping("/personas")
public class PersonaController {
	
	@Autowired
	PersonaService service;
	
	@GetMapping(value="/xml", produces="application/xml")
	public List<Persona> listarXML() {
		return service.listar();
	}
	
	@GetMapping(produces="application/json")
	public List<Persona> listar() {
		return service.listar();
	}
	
	@GetMapping(value= "/{id}")
	public Persona listarPorId(@PathVariable("id") Integer id) {
		return service.listarPorId(id);
	}
	
	@PostMapping(consumes="application/json", produces="application/json")
	public Persona registrar(@RequestBody Persona per) {
		return service.crear(per);
	}
	
	@PutMapping(consumes="application/json", produces="application/json")
	public Persona actualizar(@RequestBody Persona per) {
		return service.modificar(per);
	}
	
	@DeleteMapping(value= "/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		service.eliminar(id);
	}

}
