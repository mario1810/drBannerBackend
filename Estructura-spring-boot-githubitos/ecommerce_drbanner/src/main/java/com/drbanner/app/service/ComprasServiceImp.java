package com.drbanner.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.drbanner.app.entity.Compras;
import com.drbanner.app.repository.IComprasRepository;

public class ComprasServiceImp implements IComprasService{

	@Autowired
	IComprasRepository comprasRepository;
	
	@Override
	public List<Compras> findAllCompras() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Compras saveCompra(Compras compra) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Compras deleteCompraById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Compras findCompraById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
