package com.drbanner.app.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class DatosUsuarioLoginDTO implements Serializable{

private static final long serialVersionUID = 1L;
	
	private String email;
	private String password;
}
