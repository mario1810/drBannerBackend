package com.drbanner.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drbanner.app.dto.IsUsuarioLoginDTO;
import com.drbanner.app.entity.Compras;
import com.drbanner.app.entity.Usuarios;
import com.drbanner.app.service.IComprasService;
import com.drbanner.app.service.IUsuariosService;


/*El servicio REST nos responde sin ningún problema . Ahora bien esto se debe a que realizamos una invocación directa 
 * y no vía JavaScript . Si intentamos solicitar esta url con JavaScript utilizando jQuery nos 
 * encontraremos con un problema de Cross Origin Resource Sharing (CORS) que nos impide el acceso 
 * debido a que estamos realizando una petición ajax desde JavaScript y estas peticiones por defecto
 *  están limitadas a ficheros JavaScript que nos descarguemos desde el mismo servidor
 * El recurso esta por defecto bloqueado para peticiones que no hagan desde localhost,
 * caso de nuestra petición que se realiza desde un fichero directamente . 
 * Para solventar este problema es suficiente con modificar el servicio de Spring y añadir 
 * una cabecera @CrossOrigin para que nos permite el acceso desde otras ubicaciones.
 * */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path="/api") //localhost:port/api
public class InicioSesionController {

	@Autowired
	IUsuariosService usuariosService;
	
	@Autowired
	IComprasService comprasService;
	
	
	@GetMapping("/login")
	public IsUsuarioLoginDTO  iniciarSesion(@RequestBody Usuarios  datosUsuario) {
		
		IsUsuarioLoginDTO auxUser= new IsUsuarioLoginDTO();
		//Verificamos si el usuario est'a en la BD
		Usuarios usuario = usuariosService.findUsuarioLogin(datosUsuario.getCorreo(), datosUsuario.getPassword());
		if(usuario!=null) {
			// Si está en la base de datos
			auxUser.setUserId(usuario.getIdUsuario());
			Compras compra =comprasService.findCompraUsuario(usuario);
			if(compra!=null) {
				//Obtenemos la compra del usuario que ya tenia en proceso
				auxUser.setCompraId(compra.getIdCompra());
			}else {
				// Creamos una compra vacia al usuario
				compra = new Compras();
				compra.setUsuarios(usuario);
				compra=comprasService.saveCompra(compra);
				auxUser.setCompraId(compra.getIdCompra());
			}
		}else{
			//No hay usuario registrado con esos datos
			auxUser.setUserId(null);
			auxUser.setCompraId(null);
		}
		return auxUser;
	}
	
}
