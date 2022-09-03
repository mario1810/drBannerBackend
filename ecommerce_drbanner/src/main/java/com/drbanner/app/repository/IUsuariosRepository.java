package com.drbanner.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.drbanner.app.entity.Usuarios;

@Repository
public interface IUsuariosRepository extends CrudRepository<Usuarios,Long> {

	@Query(value="SELECT * FROM Usuarios  WHERE correo=?1 AND password=?2 LIMIT 1",nativeQuery=true)
	Optional<Usuarios> findUsuarioByCorreoAndPassword(String correo, String password);
	
	Optional<Usuarios> findByCorreo(String correo);
}
