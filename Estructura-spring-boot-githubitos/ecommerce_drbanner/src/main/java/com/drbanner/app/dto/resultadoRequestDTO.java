package com.drbanner.app.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class resultadoRequestDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer resultado;
	private String  error;
}
