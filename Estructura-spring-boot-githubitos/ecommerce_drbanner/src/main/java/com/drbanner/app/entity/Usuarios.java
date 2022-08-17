package com.drbanner.app.entity;
import java.io.Serializable;
import java.sql.Date;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class Usuarios implements Serializable {
private static final long serialVersionUID = 1L;
	
	//Llave primaria
	@Id//primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idUsuario;
	
	//resto de colum
	private String nombre;
	private String apellido;
	private String correo;
	private String password;
	private String telefono;
	private String avatar;
	private String numeroTarjeta;
	private String tipoTarjeta;
	
	
	//llave foranea
	@ManyToOne(fetch=FetchType.LAZY)//Foreign key
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Roles rolIdRol ;

}
