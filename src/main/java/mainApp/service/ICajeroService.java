package mainApp.service;

import java.util.List;

import mainApp.dto.Cajero;

public interface ICajeroService {
	
	// METODOS DEL CRUD
	public List<Cajero> listaCajeros(); // LISTAR TODOS LOS CAJEROS
	
	public List<Cajero> listarCajeroNombre(String nom_apels); // LISTA CAJERO POR NOMBRE

	public Cajero addCajero(Cajero cajero); // ADD NUEVO CAJERO

	public Cajero getCajeroById(Long codigo); // GET CAJERO BY ID

	public Cajero actualizarCajero(Cajero cajero); // ACTUALIZA DATOS DEL CAJERO

	public void deleteCajero(Long codigo); // ELIMINA EL CAJERO

}
