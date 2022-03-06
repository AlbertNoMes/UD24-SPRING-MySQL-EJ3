package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import mainApp.dao.ICajeroDAO;
import mainApp.dto.Cajero;

public class CajeroServiceImpl implements ICajeroService {

	@Autowired
	ICajeroDAO iCajeroDAO;
	
	@Override
	public List<Cajero> listaCajeros() {
		return iCajeroDAO.findAll();
	}
	
	@Override
	public List<Cajero> listarCajeroNombre(String nom_apels) {
		return iCajeroDAO.findByNombre(nom_apels);
	}

	@Override
	public Cajero addCajero(Cajero cajero) {
		return iCajeroDAO.save(cajero);
	}

	@Override
	public Cajero getCajeroById(Long codigo) {
		return iCajeroDAO.findById(codigo).get();
	}

	@Override
	public Cajero actualizarCajero(Cajero cajero) {
		return iCajeroDAO.save(cajero);
	}

	@Override
	public void deleteCajero(Long codigo) {
		iCajeroDAO.deleteById(codigo);
	}

}
