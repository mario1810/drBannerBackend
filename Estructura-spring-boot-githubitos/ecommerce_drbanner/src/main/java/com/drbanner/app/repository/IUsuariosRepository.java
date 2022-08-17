package com.drbanner.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.drbanner.app.entity.Usuarios;

public interface IUsuariosRepository extends CrudRepository<Usuarios,Long> {

}
