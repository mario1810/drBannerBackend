package com.drbanner.app.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class ResultadoRequestDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private boolean resultado;
	private String  errorDescripcion;
}
