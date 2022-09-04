package com.drbanner.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.drbanner.app.entity.Comentarios;
import com.drbanner.app.entity.Usuarios;

public interface IComentariosRepository extends CrudRepository<Comentarios,Long>{

	@Query(value = "SELECT *  FROM comentarios WHERE usuarios_id_usuario=?1 ORDER BY fecha_Comentario DESC", nativeQuery = true)
	List<IComentarioProyeccion> findByUsuariosId(Long usuarioId);
	
	
	
	
}
