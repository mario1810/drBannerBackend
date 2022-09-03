package com.drbanner.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drbanner.app.entity.Pedidos;
import com.drbanner.app.repository.IPedidosRepository;
@Service
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
		Pedidos pedido= findPedidoById(id);
		pedidosRepository.deleteById(id);
		return pedido;
	}

	@Override
	public Pedidos findPedidoById(Long id) {
		return pedidosRepository.findById(id).orElse(null);
	}
}
