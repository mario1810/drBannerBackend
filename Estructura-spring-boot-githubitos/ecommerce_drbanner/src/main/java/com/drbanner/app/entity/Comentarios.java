package com.drbanner.app.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Entity
@Data
@Table(name="comentarios")

public class Comentarios implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	//Llave primaria
	@Id//primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idComentarios;
	
	//resto de colum
	private String comentario;
	private Date fechaComentario;
	private int estrellas;
	
	
	//llave foranea@NotNull  
	
	@ManyToOne(fetch=FetchType.LAZY)//Foreign key
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	private Usuarios usuarios;
	
	

}
