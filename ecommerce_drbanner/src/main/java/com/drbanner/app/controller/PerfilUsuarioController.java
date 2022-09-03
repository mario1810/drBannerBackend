package com.drbanner.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.drbanner.app.dto.PedidosDTO;
import com.drbanner.app.entity.Pedidos;

public class PerfilUsuarioController {
	
	
	
//	/*Se ejecuta este request cuando se abre la página de pago*/
//	@GetMapping("/carrito/historial/{id}")
//	public List<PedidosDTO> getCarritoHistorial(@PathVariable Long id) {
//
//		List<PedidosDTO> carritoFinal= new ArrayList<PedidosDTO>();
//		List<Pedidos> aux=pedidosService.findAllPedidos();
//		for(int i=0; i<aux.size();i++) {
//			
//			if(aux.get(i).getCompras().getUsuarios().getIdUsuario()==id) {
//				
//				PedidosDTO aux2= new PedidosDTO();
//				aux2.setDirección(aux.get(i).getDireccion());
//				aux2.setFecha(aux.get(i).getFecha());
//				aux2.setIdPedido(aux.get(i).getIdPedido());
//				aux2.setNombrePaquete(aux.get(i).getPaquetes().getNombrePaquete());
//				aux2.setNombreCategoria(aux.get(i).getPaquetes().getCategorias().getNombreCategoria());
//				aux2.setCosto(aux.get(i).getPaquetes().getCosto());
//				carritoFinal.add(aux2);
//			}
//		}
//		return carritoFinal;
//	}
}
