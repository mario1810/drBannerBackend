package com.drbanner.app.dto;

import java.util.List;

import com.drbanner.app.entity.Comentarios;
import com.drbanner.app.repository.IComentarioProyeccion;

import lombok.Data;

@Data
public class ComentariosDTO {

	private String nombre;
	private String apellido;
	private List<IComentarioProyeccion> comentarios;
}
