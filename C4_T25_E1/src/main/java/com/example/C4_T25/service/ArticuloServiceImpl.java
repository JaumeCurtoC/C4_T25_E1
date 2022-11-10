package com.example.C4_T25.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.C4_T25.dao.IArticuloDAO;
import com.example.C4_T25.dto.Articulo;

@Service
public class ArticuloServiceImpl implements IArticuloService {

	@Autowired
	IArticuloDAO articuloDAO;

	@Override
	public Articulo guardarArticulo(Articulo articulo) {
		// TODO Auto-generated method stub
		return articuloDAO.save(articulo);
	}

	@Override
	public Articulo articuloXID(Long id) {
		// TODO Auto-generated method stub
		return articuloDAO.findById(id).get();
	}

	@Override
	public Articulo actualizarArticulo(Articulo articulo) {
		// TODO Auto-generated method stub
		return articuloDAO.save(articulo);
	}

	@Override
	public void eliminarArticulo(Long id) {
		// TODO Auto-generated method stub
		articuloDAO.deleteById(id);
	}

	@Override
	public List<Articulo> listarArticulo() {
		// TODO Auto-generated method stub
		return articuloDAO.findAll();
	}

	@Override
	public List<Articulo> listarArticuloNombre(String nombre) {
		// TODO Auto-generated method stub
		return articuloDAO.findByNombre(nombre);
	}
	
	
	
}
