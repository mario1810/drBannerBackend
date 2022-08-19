package com.drbanner.app.service;

import java.util.List;

import com.drbanner.app.entity.Compras;
import com.drbanner.app.repository.ICarritoProyeccion;

public interface IComprasService {
	/**
	 * Enlista todos los Compras de la base de datos
	 * @param Compras 
	 * @return Listado de Compras
	 */
	public List<Compras> findAllCompras();
	/**
	 * Nos guarda el Compra en la base de datos
	 * @param Compras Datos del Compra
	 * @return Devuelve el Compra con el Id asignado
	 */ 
	public Compras saveCompra(Compras compra); 
	
	/**
	 * Elimina un Compra de la base de datos
	 * @param Id identificador del Compra a eliminar
	 */
	public Compras deleteCompraById(Long id);
	
	/**
	 * Encontrar un Compra en la base de datos
	 * @param Id identificador del Compra a buscar
	 * @return
	 */
	public Compras findCompraById(Long id);
	
	public List<ICarritoProyeccion> carritoPaquetesByCompraId(Long compraId);
}
