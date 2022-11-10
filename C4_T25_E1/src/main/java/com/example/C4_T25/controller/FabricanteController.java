package com.example.C4_T25.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.C4_T25.dto.Fabricante;
import com.example.C4_T25.service.FabricanteServiceImpl;

@RestController
@RequestMapping("/api")
public class FabricanteController {
	
	@Autowired
	FabricanteServiceImpl fabricanteServiceImpl;
	
	// Listar Fabricantes
	@GetMapping("/fabricantes")
	public List<Fabricante> listarFabricantes(){
		return fabricanteServiceImpl.listarFabricantes();
	}
	
	// Listar Fabricante por nombre
	@GetMapping("/fabricantes/nombre/{nombre}")
	public List<Fabricante> listarFabricanteNombre(@PathVariable(name = "nombre") String nombre) {
		return fabricanteServiceImpl.listarFabricanteNombre(nombre);
	}
	
	// Insertar Fabricante
	@PostMapping("/fabricantes")
	public Fabricante guardarFabricante(@RequestBody Fabricante fabricante) {
		return fabricanteServiceImpl.guardarFabricante(fabricante);
		
	}
	
	// Actualizar Fabricante
	@GetMapping("/fabricantes/{id}")
	public Fabricante actualizarFabricante(@PathVariable(name = "id") Long id, @RequestBody Fabricante fabricante) {
		Fabricante fab_selec = new Fabricante();
		Fabricante fab_actu = new Fabricante();
		
		fab_selec = fabricanteServiceImpl.fabricanteXID(id);
		
		fab_selec.setNombre(fabricante.getNombre());
		
		fab_actu = fabricanteServiceImpl.actualizarFabricante(fab_selec);
		
		System.out.println("Fabricante actualizado: " + fab_actu);
		
		return fab_actu;
	}
	
	// Eliminar Fabricante
	@DeleteMapping("/fabricantes/{id}")
	public void eliminarFabricante(@PathVariable(name = "id") Long id) {
		fabricanteServiceImpl.eliminarFabricante(id);
	}

}
