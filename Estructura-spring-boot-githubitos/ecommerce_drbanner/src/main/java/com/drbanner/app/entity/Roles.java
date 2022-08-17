package com.drbanner.app.entity;


import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name="roles")
public class Roles implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	@Id//primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idRol;
	
	private String tipo;

}
