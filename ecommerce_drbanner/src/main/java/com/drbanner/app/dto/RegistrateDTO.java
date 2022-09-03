package com.drbanner.app.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class RegistrateDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String nombre;
	private String apellido;
	private String correo;
	private String password; 
}
