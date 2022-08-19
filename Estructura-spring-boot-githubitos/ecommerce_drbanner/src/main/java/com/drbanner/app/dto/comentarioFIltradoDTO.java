package com.drbanner.app.dto;

import java.sql.Date;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.drbanner.app.entity.Usuarios;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class comentarioFIltradoDTO {
	private Long idComentarios;
	private String comentario;
	private Date fechaComentario;
	private int estrellas;
}
