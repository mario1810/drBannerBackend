package com.drbanner.app.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class IsUsuarioLoginDTO implements Serializable{
		private static final long serialVersionUID = 1L;
		private Long userId;
		private Long compraId; 
}
