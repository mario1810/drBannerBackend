package com.drbanner.app.service;

import java.util.List;

import com.drbanner.app.entity.Categorias;
import com.drbanner.app.entity.Paquetes;

public interface IPaquetesService {
	/**
	 * Enlista todos los Paquetess de la base de datos
	 * @param Paquetes 
	 * @return Listado de Paquetess
	 */
	public List<Paquetes> findAllPaquetes();
	/**
	 * Nos guarda el Paquetes en la base de datos
	 * @param Paquetes Datos del Paquetes
	 * @return Devuelve el Paquetes con el Id asignado
	 */ 
	public Paquetes savePaquete(Paquetes paquete); 
	
	/**
	 * Elimina un Paquetes de la base de datos
	 * @param Id identificador del Paquetes a eliminar
	 */
	public Paquetes deletePaqueteById(Long id);
	
	/**
	 * Encontrar un Paquetes en la base de datos
	 * @param Id identificador del Paquetes a buscar
	 * @return
	 */
	public Paquetes findPaqueteById(Long id);
	
	public Paquetes findPaqueteByNombreAndCategoria(String nombre, Categorias categoria);
}
