package com.drbanner.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.drbanner.app.dto.PedidosDTO;
import com.drbanner.app.dto.ResultadoRequestDTO;
import com.drbanner.app.entity.Compras;
import com.drbanner.app.entity.Pedidos;
import com.drbanner.app.service.IComprasService;
import com.drbanner.app.service.IPaquetesService;
import com.drbanner.app.service.IPedidosService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path="/api") //localhost:port/api
public class CarritoController {
	
	@Autowired
	IComprasService comprasService;
	@Autowired
	IPaquetesService paquetesService;
	@Autowired
	IPedidosService pedidosService;
	
	/*Se muestra los elementos en el carito*/
	@GetMapping("/carrito/{compraId}")
	public List<PedidosDTO> getCarritoElementos(@PathVariable Long compraId) {
		//Obtenemos la compra asosciada al carrito
		Compras miCompra= comprasService.findCompraById(compraId);
		//Obtenemos todos los pedidos en dicha compra
		List<Pedidos> aux=pedidosService.findPedidosByCompra(miCompra);
		//Filtramos la informacióna regresar
		List<PedidosDTO> carritoFinal= new ArrayList<PedidosDTO>();
		for(int i=0; i<aux.size();i++) {	
			{	
				PedidosDTO aux2= new PedidosDTO();
				aux2.setDirección(aux.get(i).getDireccion());
				aux2.setFecha(aux.get(i).getFecha());
				aux2.setIdPedido(aux.get(i).getIdPedido());
				aux2.setNombrePaquete(aux.get(i).getPaquetes().getNombrePaquete());
				aux2.setNombreCategoria(aux.get(i).getPaquetes().getCategorias().getNombreCategoria());
				aux2.setCosto(aux.get(i).getPaquetes().getCosto());
				carritoFinal.add(aux2);
			}
		}
		return carritoFinal;
	}
	
		
	
	@DeleteMapping("/carrito/{idPedido}")
		ResultadoRequestDTO borarPedidoCarrito(@PathVariable Long idPedido) {
		
		ResultadoRequestDTO resultado = new ResultadoRequestDTO();
		
		//Existe ese pedido
		if(pedidosService.findPedidoById(idPedido)!=null) {
			//Eliminamos pedido
			pedidosService.deletePedidoById(idPedido);
			resultado.setResultado(true);
			resultado.setErrorDescripcion("No hubo ningun error");
			return resultado;	
		}
		resultado.setResultado(false);
		resultado.setErrorDescripcion("No existe el paquete");
		return resultado;
	}
	
	
}
