package com.drbanner.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.drbanner.app.entity.Imagenes;

import com.drbanner.app.repository.IImagenesRepository;

public class ImagenesServiceImp implements IImagenesService{

	@Autowired
	IImagenesRepository imagenesRepository;
	
	@Override
	public List<Imagenes> findAllImagenes() {
		return (List<Imagenes>) imagenesRepository.findAll();
	}

	@Override
	public Imagenes saveImagen(Imagenes imagen) {
		return imagenesRepository.save(imagen);
	}

	@Override
	public Imagenes deleteImagen(Long id) {
		Imagenes imagen= findImagenById(id);
		imagenesRepository.deleteById(id);
		return imagen;
	}

	@Override
	public Imagenes findImagenById(Long id) {
		return imagenesRepository.findById(id).orElse(null);
	}
	
}
