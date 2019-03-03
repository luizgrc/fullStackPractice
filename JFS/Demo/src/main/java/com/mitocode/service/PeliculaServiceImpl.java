package com.mitocode.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.dao.IPeliculaDAO;
import com.mitocode.model.Pelicula;

@Service
public class PeliculaServiceImpl implements IPeliculaService {

	@Autowired
	private IPeliculaDAO dao;
	

	@Override
	public void registrar(Pelicula pel) {
	dao.save(pel);	
	}

	@Override
	public void modificar(Pelicula pel) {
		dao.save(pel);
		
	}

	@Override
	public List<Pelicula> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Pelicula listarPorId(int id) {
		Optional<Pelicula> op = dao.findById(id);
		
		return op.isPresent() ? op.get() : new Pelicula();
	}

	@Override
	public void eliminar(int id) {
		dao.deleteById(id);
		
	}

}
