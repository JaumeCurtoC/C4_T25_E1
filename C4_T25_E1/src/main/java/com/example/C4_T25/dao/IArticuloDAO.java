package com.example.C4_T25.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.C4_T25.dto.Articulo;

public interface IArticuloDAO extends JpaRepository<Articulo, Long> {
	
	// Listar Articulos por nombre
	public List<Articulo> findByNombre(String nombre);
	
} 
