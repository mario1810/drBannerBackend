package com.drbanner.app.entity;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Entity
@Data
@Table(name="imagenes")
public class Imagenes implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id	//primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idImagen;
	
	@ManyToOne(fetch=FetchType.LAZY) //Foreign key
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	private Categorias categorias;
	
	@Column(length = 2000)
	private String url;//Otros campos
	private String descripcion;
	
	
	
}
