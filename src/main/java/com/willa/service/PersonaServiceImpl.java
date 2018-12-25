package com.willa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.willa.dao.PersonaDAO;
import com.willa.model.Persona;

@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	PersonaDAO dao;

	@Override
	public List<Persona> listar() {
		return dao.findAll();
	}

	@Override
	public Persona crear(Persona per) {
		return dao.save(per);
	}

	@Override
	public Persona modificar(Persona per) {
		return dao.save(per);
	}

	@Override
	public void eliminar(int id) {
		dao.delete(id);

	}

	@Override
	public Persona listarPorId(int id) {
		return dao.findOne(id);
	}

}
