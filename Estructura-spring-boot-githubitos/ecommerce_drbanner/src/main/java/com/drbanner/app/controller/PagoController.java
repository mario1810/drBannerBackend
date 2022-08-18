package com.drbanner.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drbanner.app.dto.PagoAutorrellenoDTO;
import com.drbanner.app.dto.PagoCompraDTO;
import com.drbanner.app.entity.Usuarios;
import com.drbanner.app.service.IUsuariosService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path="/api") //localhost:port/api
public class PagoController {
	@Autowired
	IUsuariosService usuariosService;
	
		
	@GetMapping("/pago/{id}")
	public PagoAutorrellenoDTO datosUsuarioById(@PathVariable Long id) {
		Usuarios usuario=usuariosService.findUsuarioById(id);
		PagoAutorrellenoDTO formularioPago = new PagoAutorrellenoDTO();
		formularioPago.setNombre(usuario.getNombre());
		formularioPago.setApellido(usuario.getApellido());
		formularioPago.setNumeroTarjeta(usuario.getNumeroTarjeta());
		formularioPago.setTipoTarjeta(usuario.getTipoTarjeta());
		return formularioPago;
	}
	
	
	//Cambiar el tipo de objeto que retorna ¿Se usan las clases envolventes?
	@PostMapping("/pago")
	public PagoCompraDTO  newCustomer(@RequestBody PagoCompraDTO  pagoDatos) {
		Usuarios usuario=usuariosService.findUsuarioById(pagoDatos.getIdUsuario());
		if(pagoDatos.getGuardarTarjeta()) {
			usuario.setNumeroTarjeta(pagoDatos.getNumeroTarjeta());
			usuario.setTipoTarjeta(pagoDatos.getTipoTarjeta());
		}
		//Actualizar el costo de la compra y el estado de la compra
		
		return pagoDatos;
	}
	
	/*
	@PostMapping("/pago")
	public Customer newCustomer(@RequestBody Customer customer) {
		customer.setIdCustomer(null);
		return customerService.saveCustomer(customer);
	}
	
	*	@PutMapping("/customers")
	public Customer replaceCustomer(@RequestBody Customer customer) {
		//Filtros para asegurar que esté un ID y exista
		return customerService.saveCustomer(customer);
	}
	
	@DeleteMapping("customers/{id}")
	public Customer byeCustomer(@PathVariable Long id) {
		return customerService.deleteCustomerById(id);
	}
	*
	*
	*/
	
	
}
