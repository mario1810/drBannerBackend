package com.drbanner.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.drbanner.app.entity.Compras;

public interface IComprasRepository extends CrudRepository<Compras,Long>{

	@Query(value = "SELECT categorias.nombre_categoria, paquetes.nombre_paquete, paquetes.costo, pedidos.fecha, pedidos.direccion, compras.id_compra, pedidos.id_pedido FROM categorias INNER JOIN paquetes ON categorias.id_categoria = paquetes.categorias_id_categoria INNER JOIN pedidos ON paquetes.id_paquete= pedidos.paquetes_id_paquete INNER JOIN compras ON  pedidos.compras_id_compra=compras.id_compra WHERE compras.usuarios_id_usuario=?1 AND compras.carrito=0", nativeQuery = true)
	List<ICarritoProyeccion> findPaquetesByUserId(Long usuarioId);
}
