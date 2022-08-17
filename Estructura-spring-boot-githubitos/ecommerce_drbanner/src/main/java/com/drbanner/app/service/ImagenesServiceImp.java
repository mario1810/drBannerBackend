package com.drbanner.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.drbanner.app.entity.Imagenes;

import com.drbanner.app.repository.IImagenesRepository;

public class ImagenesServiceImp implements IImagenesService{

	@Autowired
	IImagenesRepository ImagenesRepository;
	
	@Override
	public List<Imagenes> findAllImagenes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Imagenes saveImagen(Imagenes imagen) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Imagenes deleteImagen(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Imagenes findImagenById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
