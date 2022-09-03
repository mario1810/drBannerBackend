package com.drbanner.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drbanner.app.entity.Categorias;
import com.drbanner.app.repository.ICategoriasRepository;

@Service
public class CategoriasServiceImp implements ICategoriasService {

	@Autowired
	ICategoriasRepository categoriasRepository;
	
	@Override
	public List<Categorias> findAllCategorias() {		
		return (List<Categorias>) categoriasRepository.findAll();
	}
	
	@Override
	public Categorias saveCategoria(Categorias categoria) {		
		return categoriasRepository.save(categoria);
	}

	
	@Override
	public Categorias deleteCategoriaById(Long id) {
		Categorias categoria= findCategoriaById(id);
		categoriasRepository.deleteById(id);
		return categoria;
	}
	
	
	
	@Override
	public Categorias findCategoriaById(Long id) {
		return categoriasRepository.findById(id).orElse(null);
	}
	

}
