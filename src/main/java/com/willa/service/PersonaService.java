package com.willa.service;

import java.util.List;

import com.willa.model.Persona;

public interface PersonaService {
	
	List<Persona> listar();
	Persona crear(Persona per);
	Persona listarPorId(int id);
	Persona modificar(Persona per);
	void eliminar(int id);
	
}
