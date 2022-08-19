package com.drbanner.app.dto;

import java.io.Serializable;
import java.util.List;

import com.drbanner.app.entity.Comentarios;
import com.drbanner.app.repository.IComentarioProyeccion;

import lombok.Data;

@Data
public class PerfilDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String nombre;
	private String apellido;
	private String correo;
	private String password;
	private String telefono;
//	private List<IComentarioProyeccion> comentarios;
}
