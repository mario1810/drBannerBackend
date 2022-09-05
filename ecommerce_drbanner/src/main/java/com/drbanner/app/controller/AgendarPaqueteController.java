package com.drbanner.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drbanner.app.dto.PedidoAAgregarDTO;
import com.drbanner.app.dto.PerfilDTO;
import com.drbanner.app.dto.ResultadoRequestDTO;
import com.drbanner.app.entity.Categorias;
import com.drbanner.app.entity.Compras;
import com.drbanner.app.entity.Paquetes;
import com.drbanner.app.entity.Pedidos;
import com.drbanner.app.entity.Usuarios;
import com.drbanner.app.service.ICategoriasService;
import com.drbanner.app.service.IComprasService;
import com.drbanner.app.service.IPaquetesService;
import com.drbanner.app.service.IPedidosService;
import com.drbanner.app.service.IUsuariosService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(path="/api/agenda")
public class AgendarPaqueteController {
	
	@Autowired
	IPaquetesService paquetesService;
	@Autowired
	IPedidosService pedidosService;
	@Autowired
	ICategoriasService categoriasService;
	@Autowired
	IComprasService comprasService;
	@Autowired
	IUsuariosService usuariosService;
	
	
	@PostMapping("/addPaquete")
	public ResultadoRequestDTO  addPaqueteToPedido(@RequestBody PedidoAAgregarDTO miPedido) {
		
		ResultadoRequestDTO resp= new ResultadoRequestDTO();
		resp.setResultado(false);
		//encontramos usuario para guardar número telefono
		Usuarios usuario=usuariosService.findUsuarioById(miPedido.getUserId());
		if(usuario==null) {
			resp.setErrorDescripcion("Hay un error en la información recibida, usuario");
			return resp;
		}
		//Encontramos la categoria  con la info dada
		Categorias categoria= categoriasService.findCatgoriaByNombre(miPedido.getNombreCategoria());
		//Encontramos el paquete con la info dada
		Paquetes paquete= paquetesService.findPaqueteByNombreAndCategoria(miPedido.getNombrePaquete(), categoria);
		//Encontramos la compra a la que se asignará el paquete
		Compras compra= comprasService.findCompraById(miPedido.getCompraId());
		if(categoria==null || paquete == null || compra== null) {
			resp.setErrorDescripcion("Hay un error en la información recibida");
			return resp;
		}
		//Creamos el pedido a almacenar
		Pedidos pedido = new Pedidos();
		 
		pedido.setPaquetes(paquete);
		pedido.setCompras(compra);
		pedido.setFecha(miPedido.getFecha());
		pedido.setDireccion(miPedido.getDireccion());
		pedido.setIdPedido(null);
		pedido=pedidosService.savePedido(pedido);
		//Guardamos telefono
		usuario.setTelefono(miPedido.getTelefono());
		usuariosService.saveUsuario(usuario);
		
		resp.setResultado(true);
		resp.setErrorDescripcion("No hay error");
		return resp; 
		
	}
	
	@GetMapping("/{userId}")
	public PerfilDTO datosUsuario(@PathVariable Long userId) {
		Usuarios usuario=usuariosService.findUsuarioById(userId);
		PerfilDTO perfil = new PerfilDTO();
		perfil.setNombre(usuario.getNombre());
		perfil.setApellido(usuario.getApellido());
		perfil.setCorreo(usuario.getCorreo());
		perfil.setPassword(usuario.getPassword());
		perfil.setTelefono(usuario.getTelefono());
		return perfil;
	}

}
