package com.mitocode.service;

import java.util.List;

import com.mitocode.model.Pelicula;

public interface IPeliculaService {
	
public void registrar(Pelicula pel);
public void modificar(Pelicula pel);
public List<Pelicula> listar();
public Pelicula listarPorId(int id);
public void eliminar(int id);
}
