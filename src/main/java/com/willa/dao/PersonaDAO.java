package com.willa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.willa.model.Persona;

public interface PersonaDAO extends JpaRepository<Persona,Integer>{
}
