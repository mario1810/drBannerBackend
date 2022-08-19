package com.drbanner.app.repository;

import java.sql.Date;

public interface IComentarioProyeccion {

	Long getIdComentarios();
	Date getFechaComentario();
	int getEstrellas();
	String getComentario();
}
