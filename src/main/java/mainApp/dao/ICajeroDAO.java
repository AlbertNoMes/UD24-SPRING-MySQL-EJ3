package mainApp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mainApp.dto.Cajero;

public interface ICajeroDAO extends JpaRepository<Cajero, Long> {
	
	public List<Cajero> findByNombre(String nom_apels);
	
}
