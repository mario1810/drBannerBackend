package com.drbanner.app.service;

import java.util.List;

import com.drbanner.app.entity.Imagenes;

public interface IImagenesService {
	/**
	 * Enlista todos los Imagens de la base de datos
	 * @param Imagenes 
	 * @return Listado de Imagens
	 */
	public List<Imagenes> findAllImagenes();
	/**
	 * Nos guarda el Imagen en la base de datos
	 * @param Imagenes Datos del Imagen
	 * @return Devuelve el Imagen con el Id asignado
	 */ 
	public Imagenes saveImagen(Imagenes imagen); 
	
	/**
	 * Elimina un Imagen de la base de datos
	 * @param Id identificador del Imagen a eliminar
	 */
	public Imagenes deleteImagen(Long id);
	
	/**
	 * Encontrar un Imagen en la base de datos
	 * @param Id identificador del Imagen a buscar
	 * @return
	 */
	public Imagenes findImagenById(Long id);
}
