package com.drbanner.app.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drbanner.app.dto.PagoAutorrellenoDTO;
import com.drbanner.app.dto.PagoCompraDTO;
import com.drbanner.app.entity.Compras;
import com.drbanner.app.entity.Usuarios;
import com.drbanner.app.service.IComprasService;
import com.drbanner.app.service.IUsuariosService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path="/api") //localhost:port/api
public class PagoController {
	
	@Autowired
	IUsuariosService usuariosService;
	@Autowired
	IComprasService comprasService;
	
	/*Se ejecuta este request cuando se abre la página de pago*/
	/*/api/pago/{idUser}*/
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
	
	
	/*Se ejecuta este request cuando se da click en pagar*/
	/*/api/pago*/
	@PutMapping("/pago")
	public Compras  newCustomer(@RequestBody PagoCompraDTO  pagoDatos) {
		//¿Guaradamos datos el usuario?
		if(pagoDatos.getGuardarTarjeta()) {
			Usuarios usuario=usuariosService.findUsuarioById(pagoDatos.getIdUsuario());
			usuario.setNumeroTarjeta(pagoDatos.getNumeroTarjeta());
			usuario.setTipoTarjeta(pagoDatos.getTipoTarjeta());
			//Actualizamos el usuario			
			usuariosService.saveUsuario(usuario);
		}
		//Actualizamos tabla de compra
		Compras compra = comprasService.findCompraById(pagoDatos.getIdCompra());
		//fecha
		//Date myDate = Date.now();
		//compra.setFechaCompra(myDate);
		//Actualizamos que el carrito ha sido comprado
		compra.setCarrito(1);
		//Actualizamos la compra
		comprasService.saveCompra(compra);
		return compra;
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
