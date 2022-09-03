package com.drbanner.app.service;

import java.util.List;

import com.drbanner.app.entity.Pedidos;

public interface IPedidosService {
	/**
	 * Enlista todos los Pedidos de la base de datos
	 * @param Pedidos 
	 * @return Listado de Pedidos
	 */
	public List<Pedidos> findAllPedidos();
	/**
	 * Nos guarda el Pedido en la base de datos
	 * @param Pedidos Datos del Pedido
	 * @return Devuelve el Pedido con el Id asignado
	 */ 
	public Pedidos savePedido(Pedidos pedido); 
	
	/**
	 * Elimina un Pedido de la base de datos
	 * @param Id identificador del Pedido a eliminar
	 */
	public Pedidos deletePedidoById(Long id);
	
	/**
	 * Encontrar un Pedido en la base de datos
	 * @param Id identificador del Pedido a buscar
	 * @return
	 */
	public Pedidos findPedidoById(Long id);
}
