package com.drbanner.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drbanner.app.dto.AddPedidoDTO;
import com.drbanner.app.dto.ResultadoRequestDTO;
import com.drbanner.app.dto.SolicitudCrearCompraDTO;
import com.drbanner.app.entity.Compras;
import com.drbanner.app.entity.Pedidos;
import com.drbanner.app.service.IComprasService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path="/api") //localhost:port/api
public class FormularioPaquetesController {

	@Autowired
	IComprasService comprasService;
	
	/*Post para crear la compra, se envia una compra vacia, pero con el ID de usuario*/
	@PostMapping("/formularioPaquetes/crearCompra")
	ResultadoRequestDTO  crearCompra(@RequestBody Compras compra) {
		//7creamos un objeto compra
		compra.setIdCompra(null);
		comprasService.saveCompra(compra);		
		ResultadoRequestDTO resultado = new ResultadoRequestDTO();
		resultado.setResultado(true);
		resultado.setErrorDescripcion("No hubo ningun error");
		return resultado;
	}
	
	/*Post para añadir un pedido*/
	@PostMapping("/formularioPaquetes/addPedidio")
	ResultadoRequestDTO  crearCompra(@RequestBody AddPedidoDTO pedidoAux) {
		
		Pedidos pedido= new Pedidos();
		pedido.getFecha();
		pedido.getDireccion();
		pedido.getIdPedido(null);
		pedido.getCompras(comprasService.findCompraById(pedidoAux.get));
		//creamos un objeto compra
		compra.setIdCompra(null);
		comprasService.saveCompra(compra);		
		ResultadoRequestDTO resultado = new ResultadoRequestDTO();
		resultado.setResultado(true);
		resultado.setErrorDescripcion("No hubo ningun error");
		return resultado;
	}
}
