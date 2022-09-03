package com.drbanner.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drbanner.app.entity.Usuarios;
import com.drbanner.app.repository.IUsuariosRepository;
@Service
public class UsuariosServiceImp implements IUsuariosService{

	@Autowired
	IUsuariosRepository usuariosRepository;
	
	@Override
	public List<Usuarios> findAllUsuarios() {		
		return (List<Usuarios>) usuariosRepository.findAll();
	}
	
	@Override
	public Usuarios saveUsuario(Usuarios usuario) {		
		return usuariosRepository.save(usuario);
	}

	
	@Override
	public Usuarios deleteUsuarioById(Long id) {
		Usuarios usuario= findUsuarioById(id);
		usuariosRepository.deleteById(id);
		return usuario;
	}
	
	
	
	@Override
	public Usuarios findUsuarioById(Long id) {
		return usuariosRepository.findById(id).orElse(null);
	}
	
	@Override
	public Usuarios findUsuarioLogin(String correo, String password) { 
		return usuariosRepository.findUsuarioByCorreoAndPassword(correo, password).orElse(null);
	}

	@Override
	public Usuarios findUsuarioByCorreo(String correo) {
		return usuariosRepository.findByCorreo(correo).orElse(null);
	}
	
	

}
