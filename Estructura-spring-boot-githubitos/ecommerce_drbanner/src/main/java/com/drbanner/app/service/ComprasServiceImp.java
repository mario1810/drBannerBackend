package com.drbanner.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drbanner.app.entity.Compras;
import com.drbanner.app.repository.ICarritoProyeccion;
import com.drbanner.app.repository.IComprasRepository;
@Service
public class ComprasServiceImp implements IComprasService{

	@Autowired
	IComprasRepository comprasRepository;
	
	@Override
	public List<Compras> findAllCompras() {
		return (List<Compras>) comprasRepository.findAll();
	}

	@Override
	public Compras saveCompra(Compras compra) {
		return comprasRepository.save(compra);
	}

	@Override
	public Compras deleteCompraById(Long id) {
		Compras compra= findCompraById(id);
		comprasRepository.deleteById(id);
		return compra;
	}

	@Override
	public Compras findCompraById(Long id) {
		return comprasRepository.findById(id).orElse(null);
	}
	
	public List<ICarritoProyeccion> carritoPaquetesByUserId(Long usuarioId){
		return comprasRepository.findPaquetesByUserId(usuarioId);
	}

}
