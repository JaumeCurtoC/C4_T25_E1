package com.example.C4_T25.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.C4_T25.dto.Fabricante;

public interface IFabricanteDAO extends JpaRepository<Fabricante, Long> {

	// Listar fabricantes por nombre
	public List<Fabricante> findByNombre(String nombre);
	
}
