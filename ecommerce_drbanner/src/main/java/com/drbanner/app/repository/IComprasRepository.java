package com.drbanner.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.drbanner.app.entity.Compras;

public interface IComprasRepository extends CrudRepository<Compras,Long>{

	@Query(value = "SELECT * FROM pedidos INNER JOIN compras ON pedidos.compras_id_compra = pedidos.id_pedido WHERE compras.id_compra=?1 AND compras.carrito=0", nativeQuery = true)
	List<ICarritoProyeccion> findPaquetesByCompraId(Long usuarioId);
}
