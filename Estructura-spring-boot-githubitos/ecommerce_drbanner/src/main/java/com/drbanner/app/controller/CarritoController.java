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

import com.drbanner.app.dto.PagoAutorrellenoDTO;
import com.drbanner.app.dto.PedidosDTO;
import com.drbanner.app.dto.ResultadoRequestDTO;
import com.drbanner.app.entity.Compras;
import com.drbanner.app.entity.Paquetes;
import com.drbanner.app.entity.Pedidos;
import com.drbanner.app.entity.Usuarios;
import com.drbanner.app.repository.ICarritoProyeccion;
import com.drbanner.app.service.IComprasService;
import com.drbanner.app.service.IPaquetesService;
import com.drbanner.app.service.IPedidosService;
import com.drbanner.app.service.PedidosServiceImp;

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
	
	/*Se ejecuta este request cuando se abre la página de pago*/
	@GetMapping("/carrito/{id}")
	public List<PedidosDTO> getCarritoElementos(@PathVariable Long id) {

		List<PedidosDTO> carritoFinal= new ArrayList<PedidosDTO>();
		List<Pedidos> aux=pedidosService.findAllPedidos();
		for(int i=0; i<aux.size();i++) {
			
			if(aux.get(i).getCompras().getIdCompra()==id && aux.get(i).getCompras().getCarrito()==0) {
				
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
	
	
	/*Se ejecuta este request cuando se abre la página de pago*/
	@GetMapping("/carrito/historial/{id}")
	public List<PedidosDTO> getCarritoHistorial(@PathVariable Long id) {

		List<PedidosDTO> carritoFinal= new ArrayList<PedidosDTO>();
		List<Pedidos> aux=pedidosService.findAllPedidos();
		for(int i=0; i<aux.size();i++) {
			
			if(aux.get(i).getCompras().getUsuarios().getIdUsuario()==id) {
				
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

	/*Se ejecuta este request cuando se abre la página de pago*/
//	@GetMapping("/carrito2/{id}")
//	public List<Pedidos> obtieneCarritoPaquetes2(@PathVariable Long id) {
//				
//	}
	
	
	@DeleteMapping("/carrito/paquete/{idPaquete}")
		ResultadoRequestDTO borarPaqueteCarrito(@PathVariable Long idPaquete) {
		ResultadoRequestDTO resultado = new ResultadoRequestDTO();
		if(paquetesService.findPaqueteById(idPaquete)!=null) {
			paquetesService.deletePaqueteById(idPaquete);

			resultado.setResultado(true);
			resultado.setErrorDescripcion("No hubo ningun error");
			return resultado;	
		}
		resultado.setResultado(false);
		resultado.setErrorDescripcion("No existe el paquete");
		return resultado;
	}
	
	/*Se recibe una petición cuano el carrito está vacio*/
	@DeleteMapping("/carrito/compra/{idCompra}")
	ResultadoRequestDTO boraCompra(@PathVariable Long idCompra) {
	ResultadoRequestDTO resultado = new ResultadoRequestDTO();
	if(comprasService.findCompraById(idCompra)!=null) {
		comprasService.deleteCompraById(idCompra);
		resultado.setResultado(true);
		resultado.setErrorDescripcion("No hubo ningun error");
		return resultado;	
	}
	resultado.setResultado(false);
	resultado.setErrorDescripcion("No existe la compra");
	return resultado;
}
	
}
