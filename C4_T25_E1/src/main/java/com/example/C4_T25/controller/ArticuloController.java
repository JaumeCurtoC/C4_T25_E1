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

import com.example.C4_T25.dto.Articulo;
import com.example.C4_T25.service.ArticuloServiceImpl;

@RestController
@RequestMapping("/api")
public class ArticuloController {

	@Autowired
	ArticuloServiceImpl articuloServiceImpl;
	
	// Metodo Listar Articulos
	@GetMapping("/articulos")
	public List<Articulo> listarArticulos(){
		return articuloServiceImpl.listarArticulo();
	}
	
	// Metodo Listar Articulo por nombre
	@GetMapping("/articulos/nombre/{nombre}")
	public List<Articulo> listarArticuloNombre(@PathVariable(name = "nombre") String nombre) {
		return articuloServiceImpl.listarArticuloNombre(nombre);
	}
	
	// Metodo insertar Articulo
	@PostMapping("/articulos")
	public Articulo guardarArticulo(@RequestBody Articulo articulo) {
		return articuloServiceImpl.guardarArticulo(articulo);
	}
	
	// Metodo actualizar Articulo
	@GetMapping("/empleados/{id}")
	public Articulo actualizarArticulo(@PathVariable(name = "id") Long id, @RequestBody Articulo articulo) {
		Articulo art_selec = new Articulo();
		Articulo art_actu = new Articulo();
		
		art_selec = articuloServiceImpl.articuloXID(id);
		
		art_selec.setNombre(articulo.getNombre());
		art_selec.setPrecio(articulo.getPrecio());
		art_selec.setFabricante(articulo.getFabricante());
		
		art_actu = articuloServiceImpl.actualizarArticulo(art_selec);
		
		System.out.println("Articulo actualizado: "+ art_actu);
		
		return art_actu;
	}
	
	// Metodo eliminar Articulo
	@DeleteMapping("/articulos/{id}")
	public void eliminarArticulo(@PathVariable(name = "id") Long id) {
		articuloServiceImpl.eliminarArticulo(id);
	}
}
