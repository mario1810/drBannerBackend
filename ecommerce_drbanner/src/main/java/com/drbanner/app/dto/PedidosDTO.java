package com.drbanner.app.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class PedidosDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	 //String nombreCategoria();
	 //String nombrePaquete();
	 //String costo();
	 private String fecha;
	 private String direccion;
	 //Long paquetes_id_paquete();
	 //Long idCompra();
	 Long idPedido;
	 private String nombrePaquete;
	 private String nombreCategoria;
	 private String costo;
}
