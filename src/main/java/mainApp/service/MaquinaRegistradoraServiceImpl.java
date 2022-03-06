package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import mainApp.dao.IMaquinaRegistradoraDAO;
import mainApp.dto.MaquinaRegistradora;

public class MaquinaRegistradoraServiceImpl implements IMaquinaRegistradoraService{

	@Autowired
	IMaquinaRegistradoraDAO iMaquinaRegistradoraDAO;
	
	@Override
	public List<MaquinaRegistradora> listaMaquinasRegistradoras() {
		return iMaquinaRegistradoraDAO.findAll();
	}

	@Override
	public MaquinaRegistradora addMaquinaRegistradora(MaquinaRegistradora maquinaRegistradora) {
		return iMaquinaRegistradoraDAO.save(maquinaRegistradora);
	}

	@Override
	public MaquinaRegistradora getMaquinaRegistradoraById(Long codigo) {
		return iMaquinaRegistradoraDAO.findById(codigo).get();
	}

	@Override
	public MaquinaRegistradora actualizarMaquinaRegistradora(MaquinaRegistradora maquinaRegistradora) {
		return iMaquinaRegistradoraDAO.save(maquinaRegistradora);
	}

	@Override
	public void deleteMaquinaRegistradora(Long codigo) {
		iMaquinaRegistradoraDAO.deleteById(codigo);
	}

}
