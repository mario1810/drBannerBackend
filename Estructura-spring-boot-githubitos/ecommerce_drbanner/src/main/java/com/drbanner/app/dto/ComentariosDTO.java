package com.drbanner.app.dto;

import java.io.Serializable;
import java.util.List;

import com.drbanner.app.entity.Comentarios;
import com.drbanner.app.repository.IComentarioProyeccion;

import lombok.Data;

@Data
public class ComentariosDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String nombre;
	private String apellido;
	private List<IComentarioProyeccion> comentarios;
}
