package com.drbanner.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.drbanner.app.entity.Comentarios;

public interface IComentariosRepository extends CrudRepository<Comentarios,Long>{

	@Query(value = "SELECT *  FROM comentarios WHERE usuarios_id_usuario=?1", nativeQuery = true)
	List<IComentarioProyeccion> findByUsuariosId(Long usuarioId);
	
	
	
	
}
