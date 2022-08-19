package com.drbanner.app.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class PagoCompraDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long idUsuario;
	private String nombre;
	private String numeroTarjeta;
	private String tipoTarjeta;
	private String mes;
	private String anio;
	private String cvv;
	private Boolean guardarTarjeta;
	private Long idCompra;
}
