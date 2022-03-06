package mainApp.service;

import java.util.List;

import mainApp.dto.MaquinaRegistradora;

public interface IMaquinaRegistradoraService {

	// METODOS DEL CRUD
	public List<MaquinaRegistradora> listaMaquinasRegistradoras(); // LISTAR TODOS LAS MAQUINAS REGISTRADORAS

	public MaquinaRegistradora addMaquinaRegistradora(MaquinaRegistradora maquinaRegistradora); // ADD NUEVA MAQUINA REGISTRADORA

	public MaquinaRegistradora getMaquinaRegistradoraById(Long codigo); // GET MAQUINA REGISTRADORA BY ID

	public MaquinaRegistradora actualizarMaquinaRegistradora(MaquinaRegistradora maquinaRegistradora); // ACTUALIZA DATOS DE LA MAQUINA REGISTRADORA

	public void deleteMaquinaRegistradora(Long codigo); // ELIMINA LA MAQUINA REGISTRADORA
	
}
