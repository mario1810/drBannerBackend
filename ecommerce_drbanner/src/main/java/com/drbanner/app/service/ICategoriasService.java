package com.drbanner.app.service;

import java.util.List;

import com.drbanner.app.entity.Categorias;

public interface ICategoriasService {
		/**
	 * Enlista todos los categorias de la base de datos
	 * @param Categorias 
	 * @return Listado de categorias
	 */
	public List<Categorias> findAllCategorias();
	/**
	 * Nos guarda el categoria en la base de datos
	 * @param Categoria Datos del categoria
	 * @return Devuelve el categoria con el Id asignado
	 */ 
	public Categorias saveCategoria(Categorias categoria); 
	
	/**
	 * Elimina un categoria de la base de datos
	 * @param Id identificador del categoria a eliminar
	 */
	public Categorias deleteCategoriaById(Long id);
	
	/**
	 * Encontrar un categoria en la base de datos
	 * @param Id identificador del categoria a buscar
	 * @return
	 */
	public Categorias findCategoriaById(Long id);
	
	public Categorias findCatgoriaByNombre(String nombre);
}
