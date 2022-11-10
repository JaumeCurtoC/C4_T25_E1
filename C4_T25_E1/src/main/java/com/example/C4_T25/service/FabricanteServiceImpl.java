package com.example.C4_T25.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.C4_T25.dao.IFabricanteDAO;
import com.example.C4_T25.dto.Fabricante;

@Service
public class FabricanteServiceImpl implements IFabricanteService {

	@Autowired
	IFabricanteDAO fabricanteDAO;

	@Override
	public Fabricante guardarFabricante(Fabricante fabricante) {
		// TODO Auto-generated method stub
		return fabricanteDAO.save(fabricante);
	}

	@Override
	public Fabricante fabricanteXID(Long id) {
		// TODO Auto-generated method stub
		return fabricanteDAO.findById(id).get();
	}

	@Override
	public Fabricante actualizarFabricante(Fabricante fabricante) {
		// TODO Auto-generated method stub
		return fabricanteDAO.save(fabricante);
	}

	@Override
	public void eliminarFabricante(Long id) {
		// TODO Auto-generated method stub
		fabricanteDAO.deleteById(id);
	}

	@Override
	public List<Fabricante> listarFabricantes() {
		// TODO Auto-generated method stub
		return fabricanteDAO.findAll();
	}

	@Override
	public List<Fabricante> listarFabricanteNombre(String nombre) {
		// TODO Auto-generated method stub
		return fabricanteDAO.findByNombre(nombre);
	}
	
	
}
