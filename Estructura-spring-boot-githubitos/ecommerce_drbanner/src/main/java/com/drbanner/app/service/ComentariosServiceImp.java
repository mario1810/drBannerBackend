package com.drbanner.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drbanner.app.entity.Comentarios;
import com.drbanner.app.repository.IComentarioProyeccion;
import com.drbanner.app.repository.IComentariosRepository;
@Service
public class ComentariosServiceImp implements IComentariosService{

	@Autowired
	IComentariosRepository comentariosRepository;
	
	
	@Override
	public List<Comentarios> findAllComentarios() {
		return (List<Comentarios>) comentariosRepository.findAll();
	}

	@Override
	public Comentarios saveComentario(Comentarios comentario) {
		return comentariosRepository.save(comentario);
	}

	@Override
	public Comentarios deleteComentarioById(Long id) {
		Comentarios comentario= findComentarioById(id);
		comentariosRepository.deleteById(id);
		return comentario;
	}

	@Override
	public Comentarios findComentarioById(Long id) {
		return comentariosRepository.findById(id).orElse(null);
	}

	@Override
	public List<IComentarioProyeccion> findComentariosByIdUsario(Long IdUsuario) {
		return comentariosRepository.findByUsuariosId(IdUsuario);
	}
}

	

	
