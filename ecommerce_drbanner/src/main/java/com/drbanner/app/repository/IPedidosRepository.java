package com.drbanner.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.drbanner.app.entity.Compras;
import com.drbanner.app.entity.Pedidos;

public interface IPedidosRepository extends CrudRepository<Pedidos,Long>{

	List<Pedidos> findByCompras(Compras compra);
}
