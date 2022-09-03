package com.drbanner.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drbanner.app.dto.IsUsuarioLoginDTO;
import com.drbanner.app.entity.Compras;
import com.drbanner.app.entity.Usuarios;
import com.drbanner.app.service.IComprasService;
import com.drbanner.app.service.IRolesService;
import com.drbanner.app.service.IUsuariosService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path="/api")
public class RegistrateController {

	@Autowired
	IUsuariosService usuariosService;
	
	@Autowired
	IComprasService comprasService;
	
	@Autowired
	IRolesService rolesService;
	
	@PostMapping("/registrate")
	public IsUsuarioLoginDTO registroUsuario(@RequestBody Usuarios datosUsuario) {
		
		IsUsuarioLoginDTO auxUser= new IsUsuarioLoginDTO();		
		
		Usuarios usuario = usuariosService.findUsuarioByCorreo(datosUsuario.getCorreo());		
		if(usuario==null) {
			//No hay usuario registrado con esos datos, creamos uno
			datosUsuario.setIdUsuario(null);
			//Asignamos el rol de cliente 
			datosUsuario.setRoles(rolesService.findRolById(1L));
			usuario = usuariosService.saveUsuario(datosUsuario);
			auxUser.setUserId(usuario.getIdUsuario());
			// Creamos una compra vacia al usuario
			Compras compra = new Compras();
			compra.setUsuarios(usuario);
			compra=comprasService.saveCompra(compra);
			auxUser.setCompraId(compra.getIdCompra());
			
		}else{
			//Hay usuario registrado con esos datos
			//Regresamos nulos indicando que el correo ya está registrado
			auxUser.setUserId(null);
			auxUser.setCompraId(null);
		}
		return auxUser;	
	}
}
