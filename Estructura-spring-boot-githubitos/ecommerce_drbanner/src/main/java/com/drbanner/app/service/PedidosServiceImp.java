package com.drbanner.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.drbanner.app.entity.Pedidos;
import com.drbanner.app.repository.IPedidosRepository;

public class PedidosServiceImp implements IPedidosService {

	@Autowired
	IPedidosRepository pedidosRepository;
	
	@Override
	public List<Pedidos> findAllPedidos() {
		
		return (List<Pedidos>) pedidosRepository.findAll();
	}

	@Override
	public Pedidos savePedido(Pedidos pedido) {
		
		return pedidosRepository.save(pedido);
	}

	@Override
	public Pedidos deletePedidoById(Long id) {
		Pedidos product= findPedidoById(id);
		pedidosRepository.deleteById(id);
		return product;
	}

	@Override
	public Pedidos findPedidoById(Long id) {
		return pedidosRepository.findById(id).orElse(null);
	}
}
