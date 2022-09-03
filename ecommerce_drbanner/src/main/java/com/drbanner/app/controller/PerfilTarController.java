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

import com.drbanner.app.dto.PerfilTarDTO;
import com.drbanner.app.entity.Usuarios;
import com.drbanner.app.service.IUsuariosService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path="/api") //localhost:port/api
public class PerfilTarController {
	
	@Autowired
	IUsuariosService usuariosService;
	
	/*Se ejecuta este request cuando se abre la página de pago*/
	/*/api/pago/{idUser}*/
	@GetMapping("/perfiltar/{id}")
	public PerfilTarDTO datosUsuarioById(@PathVariable Long id) {
		Usuarios usuario=usuariosService.findUsuarioById(id);
		PerfilTarDTO perfil = new PerfilTarDTO();
		perfil.setNombre(usuario.getNombre());
		perfil.setApellido(usuario.getApellido());
		perfil.setTipoTarjeta(usuario.getTipoTarjeta());
		perfil.setNumeroTarjeta(usuario.getNumeroTarjeta());
		return perfil;
	}
	
	
	
}
