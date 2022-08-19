package com.drbanner.app.controller;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.drbanner.app.dto.PerfilDTO;
import com.drbanner.app.dto.ResultadoRequestDTO;
import com.drbanner.app.entity.Compras;
import com.drbanner.app.entity.Usuarios;
import com.drbanner.app.service.IComprasService;
import com.drbanner.app.service.IUsuariosService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path="/api") //localhost:port/api
public class PerfilController {
	
	@Autowired
	IUsuariosService usuariosService;
	
	/*Se ejecuta este request cuando se abre la página de pago*/
	/*/api/pago/{idUser}*/
	@GetMapping("/perfil/{id}")
	public PerfilDTO datosUsuarioById(@PathVariable Long id) {
		Usuarios usuario=usuariosService.findUsuarioById(id);
		PerfilDTO perfil = new PerfilDTO();
		perfil.setNombre(usuario.getNombre());
		perfil.setApellido(usuario.getApellido());
		perfil.setCorreo(usuario.getCorreo());
		perfil.setPassword(usuario.getPassword());
		perfil.setTelefono(usuario.getTelefono());
		return perfil;
	}
	
	
	
}
