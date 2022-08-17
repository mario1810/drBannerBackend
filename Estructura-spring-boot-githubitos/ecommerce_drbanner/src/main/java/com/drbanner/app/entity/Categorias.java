package com.drbanner.app.entity;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name="categorias")
public class Categorias implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id//primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCategoria;
	private String nombreCategoria;
}
