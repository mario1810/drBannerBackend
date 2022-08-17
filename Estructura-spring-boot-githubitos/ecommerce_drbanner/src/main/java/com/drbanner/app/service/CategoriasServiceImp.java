package com.drbanner.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.drbanner.app.entity.Categorias;
import com.drbanner.app.repository.ICategoriasRepository;

public class CategoriasServiceImp implements ICategoriasService {

	@Autowired
	ICategoriasRepository categoriasRepository;
	
	@Override
	public List<Categorias> findAllCategorias() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categorias saveCategoria(Categorias categoria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categorias deleteCategoriaById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categorias findCategoriaById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
