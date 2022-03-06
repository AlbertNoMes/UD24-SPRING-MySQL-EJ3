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

import mainApp.dto.Cajero;
import mainApp.service.CajeroServiceImpl;

@RestController
@RequestMapping("/api")
public class CajeroController {

	@Autowired
	CajeroServiceImpl cajeroServiceImpl;

	// MAPEAMOS LOS METODOS DEL ServiceImpl
	@GetMapping("/cajero") // PERMITE LISTAR LOS CAJEROS CON EL /api/cajero EN EL POSTMAN
	public List<Cajero> listaCajero() {
		return cajeroServiceImpl.listaCajeros();
	}

	@GetMapping("cajero/nom_apels/{nom_apels}") // PARA LISTAR POR UN nom_apels CONCRETO
	public List<Cajero> listarCajeroNombre(@PathVariable(name = "nom_apels") String nom_apels) {
		return cajeroServiceImpl.listarCajeroNombre(nom_apels);
	}

	@PostMapping("/cajero") // PARA AÑADIR UN CAJERO
	public Cajero saveCajero(@RequestBody Cajero cajero) {
		return cajeroServiceImpl.addCajero(cajero);
	}

	@GetMapping("/cajero/{codigo}") // PARA LISTAR POR codigo
	public Cajero cajeroById(@PathVariable(name = "codigo") Long codigo) {
		return cajeroServiceImpl.getCajeroById(codigo);
	}

	@PutMapping("/cajero/{codigo}") // PARA ACTUALIZAR POR codigo
	public Cajero actualizarCajero(@PathVariable(name = "codigo") Long codigo, @RequestBody Cajero cajero) {
		Cajero cajero_seleccionado = new Cajero();
		Cajero cajero_actualizado = new Cajero();

		cajero_seleccionado = cajeroServiceImpl.getCajeroById(codigo);

		cajero_seleccionado.setNom_apels(cajero.getNom_apels());

		cajero_actualizado = cajeroServiceImpl.actualizarCajero(cajero_seleccionado);

		System.out.println("El cajero actualizado es: " + cajero_actualizado);

		return cajero_actualizado;
	}

	@DeleteMapping("/cajero/{codigo}") // PARA BORRAR POR codigo
	public void deleteCajero(@PathVariable(name = "codigo") Long codigo) {
		cajeroServiceImpl.deleteCajero(codigo);
	}

}
