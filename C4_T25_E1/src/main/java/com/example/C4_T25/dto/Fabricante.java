package com.example.C4_T25.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "fabricantes")
public class Fabricante {

	//---------ATRIBUTOS--------------
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre")
	private String nombre;
	

    @OneToMany
    @JoinColumn(name="id")
    private List<Articulo> articulos;
	
	//------------------CONSTRUCTORES----------------------------
	
	public Fabricante() {
		
	}

	public Fabricante(Long id, String nombre) {
		this.id = id;
		this.nombre = nombre;
		
	}

	//----------------GETTERS Y SETTERS------------------------------
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Articulo")
	public List<Articulo> getArticulos() {
		return articulos;
	}

	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}

	//------------------------TOSTRING-----------------------------

	@Override
	public String toString() {
		return "Fabricantes [id=" + id + ", nombre=" + nombre + "]";
	}

	
	
	
	
	
}
