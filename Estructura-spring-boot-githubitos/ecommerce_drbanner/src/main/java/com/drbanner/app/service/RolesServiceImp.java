package com.drbanner.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.drbanner.app.entity.Roles;
import com.drbanner.app.repository.IRolesRepository;

public class RolesServiceImp implements IRolesService {

	@Autowired
	IRolesRepository rolesRepository;
	
	@Override
	public List<Roles> findAllRoles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Roles saveRol(Roles rol) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Roles deleteRolById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Roles findRolById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
