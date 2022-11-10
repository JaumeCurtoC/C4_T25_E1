package com.example.C4_T25.service;

import java.util.List;

import com.example.C4_T25.dto.Fabricante;

public interface IFabricanteService {

	// CREATE
	public Fabricante guardarFabricante(Fabricante fabricante);
	
	// READ
	public Fabricante fabricanteXID(Long id);
	
	// UPDATE
	public Fabricante actualizarFabricante(Fabricante fabricante);
	
	// DELETE
	public void eliminarFabricante(Long id);
	
	// Listar todos los fabricantes
	public List<Fabricante> listarFabricantes();
	
	// Listar fabricantes por nombre
	public List<Fabricante> listarFabricanteNombre(String nombre);
	
}
