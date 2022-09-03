package com.drbanner.app.service;

import java.util.List;

import com.drbanner.app.entity.Usuarios;

public interface IUsuariosService {
	/**
	 * Enlista todos los usuarios de la base de datos
	 * @param Usuarios 
	 * @return Listado de usuarios
	 */
	public List<Usuarios> findAllUsuarios();
	/**
	 * Nos guarda el usuario en la base de datos
	 * @param Usuarios Datos del usuario
	 * @return Devuelve el usuario con el Id asignado
	 */ 
	public Usuarios saveUsuario(Usuarios usuario); 
	
	/**
	 * Elimina un usuario de la base de datos
	 * @param Id identificador del usuario a eliminar
	 */
	public Usuarios deleteUsuarioById(Long id);
	
	/**
	 * Encontrar un usuario en la base de datos
	 * @param Id identificador del usuario a buscar
	 * @return
	 */
	public Usuarios findUsuarioById(Long id);
	
	
	/**
	 * Encontrar un usuario en la base de datos, si no está significa que no está registrado
	 * @param Id identificador del usuario a buscar
	 * @return
	 */
	public Usuarios findUsuarioLogin(String correo, String password); 
	
	public Usuarios findUsuarioByCorreo(String correo);
}
