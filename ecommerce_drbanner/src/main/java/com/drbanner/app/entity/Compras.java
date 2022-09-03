package com.drbanner.app.entity;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Entity
@Data
@Table(name="compras")
public class Compras implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	//Llave primaria
	@Id//primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCompra;
	@ManyToOne(fetch=FetchType.LAZY) //Foreign key
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	private Usuarios usuarios;
	private String fechaCompra;
	private String horaCompra;
	private int carrito;
	private String costoTotal;
	
}
