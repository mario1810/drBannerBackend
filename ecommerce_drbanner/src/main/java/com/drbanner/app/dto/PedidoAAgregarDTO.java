package com.drbanner.app.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class PedidoAAgregarDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String direccion;
	private String fecha;
	private Long compraId;
	private Long userId;
	private String nombrePaquete;
	private String nombreCategoria;
	private String telefono; 
	
}
