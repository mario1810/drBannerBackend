package com.drbanner.app.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class CompraHistoDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String fechaCompra;
	private String horaCompra;
	private String costoTotal;
	private List<PedidosDTO> pedidos;
}
