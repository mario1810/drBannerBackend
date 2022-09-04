package com.drbanner.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drbanner.app.dto.CompraHistoDTO;
import com.drbanner.app.dto.PedidosDTO;
import com.drbanner.app.dto.PerfilDTO;
import com.drbanner.app.dto.PerfilTarDTO;
import com.drbanner.app.dto.ResultadoRequestDTO;
import com.drbanner.app.entity.Comentarios;
import com.drbanner.app.entity.Compras;
import com.drbanner.app.entity.Pedidos;
import com.drbanner.app.entity.Usuarios;
import com.drbanner.app.service.IComentariosService;
import com.drbanner.app.service.IComprasService;
import com.drbanner.app.service.IPedidosService;
import com.drbanner.app.service.IUsuariosService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(path="/api/usuario")
public class PerfilUsuarioController {
	
	@Autowired
	IPedidosService pedidosService;
	
	@Autowired
	IUsuariosService usuariosService;
	
	@Autowired
	IComprasService comprasService;
	
	@Autowired
	IComentariosService comentariosService;
	
	/*Se ejecuta este request cuando se abre la página de pago*/
	@GetMapping("/historial/{userId}")
	public List<CompraHistoDTO> getHistorial(@PathVariable Long userId) {
	
		Usuarios usuario = usuariosService.findUsuarioById(userId);
		List<Compras> compras = comprasService.findHistorialComprasByUsuario(usuario);
		List<CompraHistoDTO> historial= new ArrayList<>();
		
		for(Compras compra: compras) {
			CompraHistoDTO aux= new CompraHistoDTO();
			aux.setFechaCompra(compra.getFechaCompra());
			aux.setHoraCompra(compra.getHoraCompra());
			aux.setCostoTotal(compra.getCostoTotal());
			
			List<PedidosDTO> historialPedidos= new ArrayList<PedidosDTO>();
			List<Pedidos> auxPedidos=pedidosService.findPedidosByCompra(compra);
			for(int i=0; i<auxPedidos.size();i++) {
				
					PedidosDTO aux2= new PedidosDTO();
					aux2.setDireccion(auxPedidos.get(i).getDireccion());
					aux2.setFecha(auxPedidos.get(i).getFecha());
					aux2.setIdPedido(auxPedidos.get(i).getIdPedido());
					aux2.setNombrePaquete(auxPedidos.get(i).getPaquetes().getNombrePaquete());
					aux2.setNombreCategoria(auxPedidos.get(i).getPaquetes().getCategorias().getNombreCategoria());
					aux2.setCosto(auxPedidos.get(i).getPaquetes().getCosto());
					historialPedidos.add(aux2);
			}
			aux.setPedidos(historialPedidos);
			historial.add(aux);
		}
		return historial;
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
	
	
	@GetMapping("/tarjeta/{userId}")
	public PerfilTarDTO datosUsuarioById(@PathVariable Long userId) {
		Usuarios usuario=usuariosService.findUsuarioById(userId);
		PerfilTarDTO perfil = new PerfilTarDTO();
		String tTarjeta=usuario.getTipoTarjeta();
		String nTarjeta=usuario.getNumeroTarjeta();
		if(tTarjeta==null || nTarjeta==null) {
			perfil.setDatosTarjeta(false);
		}else {
			perfil.setDatosTarjeta(true);
			perfil.setNombre(usuario.getNombre());
			perfil.setApellido(usuario.getApellido());
			perfil.setTipoTarjeta(tTarjeta);
			perfil.setNumeroTarjeta(nTarjeta);
		}
		return perfil;
	}
	
	@PostMapping("/comentario/{userId}")
	public ResultadoRequestDTO  addComentario(@PathVariable Long userId, @RequestBody Comentarios comentario) {
		ResultadoRequestDTO resp= new ResultadoRequestDTO();
		Usuarios usuario=usuariosService.findUsuarioById(userId);
		if(usuario==null) {
			resp.setResultado(false);
			resp.setErrorDescripcion("Usuario no encontrado");
			return resp;
		}
		comentario.setIdComentarios(null);
		comentario.setUsuarios(usuario);
		comentariosService.saveComentario(comentario);
		resp.setResultado(true);
		resp.setErrorDescripcion("No error");
		return resp;
	}
}
