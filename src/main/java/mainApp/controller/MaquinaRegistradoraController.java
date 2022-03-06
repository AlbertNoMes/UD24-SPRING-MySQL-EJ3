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

import mainApp.dto.MaquinaRegistradora;
import mainApp.service.MaquinaRegistradoraServiceImpl;

@RestController
@RequestMapping("/api")
public class MaquinaRegistradoraController {
	
	@Autowired
	MaquinaRegistradoraServiceImpl maquinaRegistradoraServiceImpl;
	
	// MAPEAMOS LOS METODOS DEL ServiceImpl
	@GetMapping("/maquina_registradora") // PERMITE LISTAR LAS MAQUINAS CON EL /api/maquina_registradora EN EL POSTMAN
	public List<MaquinaRegistradora> listaMaquinaRegistradora(){
		return maquinaRegistradoraServiceImpl.listaMaquinasRegistradoras();
	}
	
	@PostMapping("/maquina_registradora") // PARA AÑADIR UNA MAQUINA
	public MaquinaRegistradora saveMaquinaRegistradora(@RequestBody MaquinaRegistradora maquinaRegistradora) {
		return maquinaRegistradoraServiceImpl.addMaquinaRegistradora(maquinaRegistradora);
	}
	
	@GetMapping("/maquina_registradora/{codigo}") // PARA LISTAR POR codigo
	public MaquinaRegistradora maquinaRegistradoraById(@PathVariable(name = "codigo") Long codigo) {
		return maquinaRegistradoraServiceImpl.getMaquinaRegistradoraById(codigo);
	}
	
	@PutMapping("/maquina_registradora/{codigo}") // PARA ACTUALIZAR POR codigo
	public MaquinaRegistradora actualizarMaquinaRegistradora(@PathVariable(name = "codigo") Long codigo, @RequestBody MaquinaRegistradora maquinaRegistradora) {
		MaquinaRegistradora maquina_seleccionado = new MaquinaRegistradora();
		MaquinaRegistradora maquina_actualizado = new MaquinaRegistradora();

		maquina_seleccionado = maquinaRegistradoraServiceImpl.getMaquinaRegistradoraById(codigo);

		maquina_seleccionado.setPiso(maquinaRegistradora.getPiso());

		maquina_actualizado = maquinaRegistradoraServiceImpl.actualizarMaquinaRegistradora(maquina_seleccionado);

		System.out.println("El cajero actualizado es: " + maquina_actualizado);

		return maquina_actualizado;
	}
	
	@DeleteMapping("/maquina_registradora/{codigo}") // PARA BORRAR POR codigo
	public void deleteMaquinaRegistradora(@PathVariable(name = "codigo") Long codigo) {
		maquinaRegistradoraServiceImpl.deleteMaquinaRegistradora(codigo);
	}

}
