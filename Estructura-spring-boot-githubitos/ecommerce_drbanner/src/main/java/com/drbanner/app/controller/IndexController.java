package com.drbanner.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drbanner.app.dto.ComentariosDTO;
import com.drbanner.app.dto.PagoAutorrellenoDTO;
import com.drbanner.app.dto.comentarioFIltradoDTO;
import com.drbanner.app.entity.Comentarios;
import com.drbanner.app.entity.Usuarios;
import com.drbanner.app.repository.IComentarioProyeccion;
import com.drbanner.app.service.IComentariosService;
import com.drbanner.app.service.IUsuariosService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path="/api") //localhost:port/api
public class IndexController {
	@Autowired
	IUsuariosService usuariosService;
	@Autowired
	IComentariosService comentariosService;
	
	
	@GetMapping("/index")
	public List<ComentariosDTO> obtenerComentarios() {
	     List<Usuarios> listUsers =usuariosService.findAllUsuarios();
	     List<ComentariosDTO> comentariosDTO = new ArrayList<ComentariosDTO>();
	     for(int i=0; i<listUsers.size();i++) {
	    	 ComentariosDTO aux= new ComentariosDTO();
	    	 aux.setNombre(listUsers.get(i).getNombre());
	    	 aux.setApellido(listUsers.get(i).getApellido());
	    	 aux.setComentarios(comentariosService.findComentariosByIdUsario(listUsers.get(i).getIdUsuario()));
	    	 comentariosDTO.add(aux);
	     }
	     return comentariosDTO;
	}
	
	//Funcion prueba que despliega comentarios
	@GetMapping("/index2")
	public List<IComentarioProyeccion> obtenerComentarios2() {		
		List<IComentarioProyeccion> aux = comentariosService.findComentariosByIdUsario(2L);
	     return aux;
	}
	
	
	
}
