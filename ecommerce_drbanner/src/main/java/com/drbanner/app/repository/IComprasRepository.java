package com.drbanner.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.drbanner.app.entity.Compras;
import com.drbanner.app.entity.Usuarios;
@Repository
public interface IComprasRepository extends CrudRepository<Compras,Long>{

	@Query(value = "SELECT * FROM pedidos INNER JOIN compras ON pedidos.compras_id_compra = pedidos.id_pedido WHERE compras.id_compra=?1 AND compras.carrito=0", nativeQuery = true)
	List<ICarritoProyeccion> findPaquetesByCompraId(Long usuarioId);
	
	Optional<Compras> findByUsuariosAndCarrito(Usuarios usuario, int carrito); 
}
