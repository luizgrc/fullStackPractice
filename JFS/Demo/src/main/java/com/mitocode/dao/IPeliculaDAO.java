package com.mitocode.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mitocode.model.Pelicula;

public interface IPeliculaDAO extends JpaRepository<Pelicula, Integer>{
	

}
