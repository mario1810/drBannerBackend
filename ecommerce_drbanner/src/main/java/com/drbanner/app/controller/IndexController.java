package com.drbanner.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.drbanner.app.dto.ComentariosDTO;
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
	
	
	
	
	
	@GetMapping("/comentarios")
	public List<ComentariosDTO> obtenerComentarios() {
	     List<Usuarios> listUsers =usuariosService.findAllUsuarios();
	     List<ComentariosDTO> comentariosDTO = new ArrayList<ComentariosDTO>();
	     Long idL=1L; 
	     for(int i=0; i<listUsers.size();i++) {
	    	 ComentariosDTO aux= new ComentariosDTO();
	    	 aux.setNombre(listUsers.get(i).getNombre());
	    	 aux.setApellido(listUsers.get(i).getApellido());
	    	 aux.setId(idL);
	    	 aux.setFoto(listUsers.get(i).getAvatar());
	    	 List<IComentarioProyeccion> comment=comentariosService.findComentariosByIdUsario(listUsers.get(i).getIdUsuario());
	    	 if( comment ==null || comment.size()==0)
	    		 continue;
	    	 aux.setComentario(comment.get(0).getComentario());
	    	 aux.setStars(comment.get(0).getEstrellas());
	    	 comentariosDTO.add(aux);
	    	 idL++;
	     }
	     return comentariosDTO;
	}
	
}
