package mainApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mainApp.dto.MaquinaRegistradora;

public interface IMaquinaRegistradoraDAO extends JpaRepository<MaquinaRegistradora, Long>{

}
