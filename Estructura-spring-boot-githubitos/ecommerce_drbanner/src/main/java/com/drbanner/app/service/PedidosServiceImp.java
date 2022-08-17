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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pedidos savePedido(Pedidos pedido) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pedidos deletePedidoById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pedidos findPedidoById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
