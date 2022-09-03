package com.drbanner.app.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.drbanner.app.entity.Categorias;

public interface ICategoriasRepository extends CrudRepository<Categorias,Long>{
	
	Optional<Categorias> findByNombreCategoria(String categoria);
}
