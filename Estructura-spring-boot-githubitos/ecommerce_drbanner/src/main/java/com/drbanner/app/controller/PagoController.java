package com.drbanner.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drbanner.app.entity.Usuarios;
import com.drbanner.app.service.IUsuariosService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path="/api") //localhost:port/api
public class PagoController {
	@Autowired
	IUsuariosService usuariosService;
	
	@GetMapping("/pago/{id}")
	public Usuarios datosUsuarioById(@PathVariable Long id) {		
		return usuariosService.findUsuarioById(id);
	}
	
	
	/*
	@PostMapping("/customers")
	public Customer newCustomer(@RequestBody Customer customer) {
		customer.setIdCustomer(null);
		return customerService.saveCustomer(customer);
	}
	*/
	
}
