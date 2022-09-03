package com.drbanner.app.entity;
import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Entity
@Data
@Table(name="usuarios")
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
	@Column(length = 1000)
	private String avatar;
	private String numeroTarjeta;
	private String tipoTarjeta;
	
	
	//llave foranea
	@ManyToOne(fetch=FetchType.LAZY)//Foreign key
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Roles roles;

}
