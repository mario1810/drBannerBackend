package com.drbanner.app.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.drbanner.app.entity.Categorias;
import com.drbanner.app.entity.Paquetes;

public interface IPaquetesRepository extends CrudRepository<Paquetes,Long>{

	Optional<Paquetes> findByNombrePaqueteAndCategorias(String nombre, Categorias categoria);
}
