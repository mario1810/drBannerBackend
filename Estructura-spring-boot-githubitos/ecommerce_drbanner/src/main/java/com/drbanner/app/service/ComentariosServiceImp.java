package com.drbanner.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.drbanner.app.entity.Comentarios;
import com.drbanner.app.repository.IComentariosRepository;

public class ComentariosServiceImp implements IComentariosService{

	@Autowired
	IComentariosRepository comentariosRepository;
	
	@Override
	public List<Comentarios> findAllComentarios() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comentarios saveComentario(Comentarios comentario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comentarios deleteComentarioById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comentarios findComentarioById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
