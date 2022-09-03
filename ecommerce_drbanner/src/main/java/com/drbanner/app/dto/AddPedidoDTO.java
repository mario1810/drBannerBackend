package com.drbanner.app.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class AddPedidoDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long idPedido;
	private String fecha;
	private String dirección;
	private Long idCompra;
	private Long idPaquetes;
	private Long idUaurio;
}
