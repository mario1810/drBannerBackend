package com.drbanner.app.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;


@Entity
@Data
@Table(name="pedidos")
public class Pedidos implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id//primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPedido;
	private Date fecha;
	@Column(length = 1000)
	private String direccion;
	@ManyToOne(fetch=FetchType.LAZY)//Foreign key
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Paquetes paquetes;
	
	@ManyToOne(fetch=FetchType.LAZY)//Foreign key
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Compras compras;
	

}
