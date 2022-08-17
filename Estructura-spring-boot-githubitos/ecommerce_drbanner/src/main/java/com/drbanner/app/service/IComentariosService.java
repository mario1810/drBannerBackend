package com.drbanner.app.service;

import java.util.List;

import com.drbanner.app.entity.Comentarios;

public interface IComentariosService {
	/**
	 * Enlista todos los Comentarios de la base de datos
	 * @param Comentarios 
	 * @return Listado de Comentarios
	 */
	public List<Comentarios> findAllComentarios();
	/**
	 * Nos guarda el Comentario en la base de datos
	 * @param Comentarios Datos del Comentario
	 * @return Devuelve el Comentario con el Id asignado
	 */ 
	public Comentarios saveComentario(Comentarios comentario); 
	
	/**
	 * Elimina un Comentario de la base de datos
	 * @param Id identificador del Comentario a eliminar
	 */
	public Comentarios deleteComentarioById(Long id);
	
	/**
	 * Encontrar un Comentario en la base de datos
	 * @param Id identificador del Comentario a buscar
	 * @return
	 */
	public Comentarios findComentarioById(Long id);
}
