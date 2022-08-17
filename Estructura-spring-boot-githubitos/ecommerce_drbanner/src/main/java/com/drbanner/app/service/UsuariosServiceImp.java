package com.drbanner.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.drbanner.app.entity.Usuarios;
import com.drbanner.app.repository.IUsuariosRepository;

public class UsuariosServiceImp implements IUsuariosService{

	@Autowired
	IUsuariosRepository usuariosRepository;
	
	@Override
	public List<Usuarios> findAllUsuarios() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuarios saveUsuario(Usuarios usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuarios deleteUsuarioById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuarios findUsuarioById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
