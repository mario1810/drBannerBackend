package com.drbanner.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.drbanner.app.entity.Paquetes;
import com.drbanner.app.repository.IPaquetesRepository;

public class PaquetesServiceImp implements IPaquetesService {

	@Autowired
	IPaquetesRepository paquetesRepository;
	
	@Override
	public List<Paquetes> findAllPaquetes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Paquetes savePaquete(Paquetes paquete) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Paquetes deletePaqueteById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Paquetes findPaqueteById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
