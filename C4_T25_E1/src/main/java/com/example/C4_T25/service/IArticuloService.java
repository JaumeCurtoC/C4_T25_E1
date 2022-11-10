package com.example.C4_T25.service;

import java.util.List;

import com.example.C4_T25.dto.Articulo;

public interface IArticuloService {
	
	// CREATE
	public Articulo guardarArticulo(Articulo articulo);
	
	// READ
	public Articulo articuloXID(Long id);
	
	// UPDATE
	public Articulo actualizarArticulo(Articulo articulo);
	
	// DELETE
	public void eliminarArticulo(Long id);
	
	// Listar todos los articulos
	public List<Articulo> listarArticulo();
	
	// Listar articulo por nombre
	public List<Articulo> listarArticuloNombre(String nombre);

}
