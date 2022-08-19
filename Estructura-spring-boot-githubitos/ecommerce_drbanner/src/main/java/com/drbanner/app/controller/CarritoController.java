package com.drbanner.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drbanner.app.dto.PagoAutorrellenoDTO;
import com.drbanner.app.dto.ResultadoRequestDTO;
import com.drbanner.app.entity.Paquetes;
import com.drbanner.app.entity.Usuarios;
import com.drbanner.app.repository.ICarritoProyeccion;
import com.drbanner.app.service.IComprasService;
import com.drbanner.app.service.IPaquetesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path="/api") //localhost:port/api
public class CarritoController {
	
	@Autowired
	IComprasService comprasService;
	@Autowired
	IPaquetesService paquetesService;
	
	/*Se ejecuta este request cuando se abre la página de pago*/
	/*/api/pago/{idUser}*/
	@GetMapping("/carrito/{id}")
	public List<ICarritoProyeccion> obtieneCarritoPaquetes(@PathVariable Long id) {
			
		List<ICarritoProyeccion> carritoPaquetes=comprasService.carritoPaquetesByUserId(id);
		
		return carritoPaquetes;
	}
	
	
	@DeleteMapping("/carrito/{idPaquete}")
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
	
}
