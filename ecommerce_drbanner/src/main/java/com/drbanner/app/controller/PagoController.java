package com.drbanner.app.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drbanner.app.dto.PagoAutorrellenoDTO;
import com.drbanner.app.dto.PagoCompraDTO;
import com.drbanner.app.dto.ResultadoRequestCompraDTO;
import com.drbanner.app.entity.Compras;
import com.drbanner.app.entity.Pedidos;
import com.drbanner.app.entity.Usuarios;
import com.drbanner.app.service.IComprasService;
import com.drbanner.app.service.IPedidosService;
import com.drbanner.app.service.IUsuariosService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path="/api") //localhost:port/api
public class PagoController {
	
	@Autowired
	IUsuariosService usuariosService;
	@Autowired
	IComprasService comprasService;
	@Autowired
	IPedidosService pedidosService;
	
	@GetMapping("/pago/{userId}")
	public PagoAutorrellenoDTO datosUsuario(@PathVariable Long userId) {
		PagoAutorrellenoDTO formularioPago = new PagoAutorrellenoDTO();
		Usuarios usuario=usuariosService.findUsuarioById(userId);
		//Asignamos datos generales del usuario
		formularioPago.setDatosDisponibles(false);
		formularioPago.setNombre(usuario.getNombre());
		formularioPago.setApellido(usuario.getApellido());
		String nTarjeta=usuario.getNumeroTarjeta();
		String nTipo=usuario.getTipoTarjeta();
		//Tenemos datos de la tarjeta?
		if(nTarjeta!=null && nTipo!=null) {
			formularioPago.setNumeroTarjeta(nTarjeta);
			formularioPago.setTipoTarjeta(nTipo);
			//Indicamos que si tenemos datos de tarjeta
			formularioPago.setDatosDisponibles(true);
		}
		//Calculamos el costoa pagar
		Compras compra =comprasService.findCompraUsuario(usuario);
		List<Pedidos> misPedidos=pedidosService.findPedidosByCompra(compra);
		double costoTotal=0;
		for(Pedidos pedido: misPedidos) {
			costoTotal+=Double.parseDouble(pedido.getPaquetes().getCosto());
		}
		formularioPago.setTotalPagar(String.valueOf(costoTotal));
		compra.setCostoTotal(String.valueOf(costoTotal));
		//Actualizamos la compra
		comprasService.saveCompra(compra);
		return formularioPago;
	}
	
	
	/*Se ejecuta este request cuando se da click en pagar*/
	/*/api/pago*/
	@PutMapping("/pago")
	public ResultadoRequestCompraDTO compraActualizacion(@RequestBody PagoCompraDTO  pagoDatos) {
		ResultadoRequestCompraDTO resultado = new ResultadoRequestCompraDTO();
		//¿Guaradamos datos de la trajeta del usuario?
		Usuarios usuario=usuariosService.findUsuarioById(pagoDatos.getIdUsuario());
		if(pagoDatos.getGuardarTarjeta()) {
			if(usuario==null) {
				resultado.setResultado(false);
				resultado.setErrorDescripcion("No se encontró el usuario");
				return resultado;
			}
			usuario.setNumeroTarjeta(pagoDatos.getNumeroTarjeta());
			usuario.setTipoTarjeta(pagoDatos.getTipoTarjeta());
			//Actualizamos el usuario			
			usuariosService.saveUsuario(usuario);
		}
		//Actualizamos tabla de compra
		Compras compra = comprasService.findCompraById(pagoDatos.getIdCompra());
		if(compra==null) {
			resultado.setResultado(false);
			resultado.setErrorDescripcion("No se encontró la compra");
			return resultado;
		}
		//fecha y hora
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		compra.setFechaCompra(formatter.format(date));
		formatter = new SimpleDateFormat("HH:mm:ss");
		compra.setHoraCompra(formatter.format(date));
		compra.setCostoTotal(pagoDatos.getTotal());
		//Actualizamos que el carrito ha sido comprado
		compra.setCarrito(1);
		//Actualizamos la compra
		comprasService.saveCompra(compra);
		
		//Debemos crear una compra vacia para la siguiente vez
		compra = new Compras();
		compra.setIdCompra(null);
		compra.setUsuarios(usuario);
		compra=comprasService.saveCompra(compra);
		//Actulizamos el Id  de la compra (se asigna una nueva compra vacia)
		resultado.setIdCompra(compra.getIdCompra());
		resultado.setResultado(true);
		resultado.setErrorDescripcion("No hubo ningun error");
		return resultado;
	}
}
