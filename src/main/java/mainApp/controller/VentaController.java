package mainApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mainApp.dto.Venta;
import mainApp.service.VentaServiceImpl;

@RestController
@RequestMapping("/api")
public class VentaController {
	
	@Autowired
	VentaServiceImpl ventaServiceImpl;
	
	// MAPEAMOS LOS METODOS DEL ServiceImpl
	@GetMapping("/venta") // PERMITE LISTAR LAS VENTAS CON EL /api/venta EN EL POSTMAN
	public List<Venta> listaVentas(){
		return ventaServiceImpl.listaVentas();
	}

}
