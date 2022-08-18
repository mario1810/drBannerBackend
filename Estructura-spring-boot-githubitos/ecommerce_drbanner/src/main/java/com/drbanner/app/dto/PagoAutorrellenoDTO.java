package com.drbanner.app.dto;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import com.drbanner.app.entity.Usuarios;

import lombok.Data;

@Data
public class PagoAutorrellenoDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String nombre;
	private String apellido;
	private String numeroTarjeta;
	private String tipoTarjeta;
		
}
