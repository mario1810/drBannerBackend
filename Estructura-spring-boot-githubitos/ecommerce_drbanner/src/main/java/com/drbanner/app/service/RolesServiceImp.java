package com.drbanner.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drbanner.app.entity.Roles;
import com.drbanner.app.repository.IRolesRepository;
@Service
public class RolesServiceImp implements IRolesService {

	@Autowired
	IRolesRepository rolesRepository;
	
	@Override
	public List<Roles> findAllRoles() {
		return (List<Roles>) rolesRepository.findAll();
	}

	@Override
	public Roles saveRol(Roles rol) {
		return rolesRepository.save(rol);
	}

	@Override
	public Roles deleteRolById(Long id) {
		Roles rol= findRolById(id);
		rolesRepository.deleteById(id);
		return rol;
	}

	@Override
	public Roles findRolById(Long id) {
		return rolesRepository.findById(id).orElse(null);
	}
	
}
