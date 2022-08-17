package com.drbanner.app.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Entity
@Data
@Table(name="paquetes")
public class Paquetes implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id//primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPaquete;
	
	@ManyToOne(fetch=FetchType.LAZY)//Foreign key
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Categorias categorias;
	
	private String nombrePaquete;//Otros campos
	private double costo;
	@Column(length = 3000)
	private String descripcion;
	
}
