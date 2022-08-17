package com.drbanner.app.service;

import java.util.List;

import com.drbanner.app.entity.Roles;

public interface IRolesService {
	/**
	 * Enlista todos los Rols de la base de datos
	 * @param Roles 
	 * @return Listado de Rols
	 */
	public List<Roles> findAllRoles();
	/**
	 * Nos guarda el Rol en la base de datos
	 * @param Roles Datos del Rol
	 * @return Devuelve el Rol con el Id asignado
	 */ 
	public Roles saveRol(Roles rol); 
	
	/**
	 * Elimina un Rol de la base de datos
	 * @param Id identificador del Rol a eliminar
	 */
	public Roles deleteRolById(Long id);
	
	/**
	 * Encontrar un Rol en la base de datos
	 * @param Id identificador del Rol a buscar
	 * @return
	 */
	public Roles findRolById(Long id);
}
