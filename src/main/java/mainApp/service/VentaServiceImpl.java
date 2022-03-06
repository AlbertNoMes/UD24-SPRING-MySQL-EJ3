package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import mainApp.dao.IVentaDAO;
import mainApp.dto.Venta;

public class VentaServiceImpl implements IVentaService{

	@Autowired
	IVentaDAO iVentaDAO;
	
	@Override
	public List<Venta> listaVentas() {
		return iVentaDAO.findAll();
	}

	@Override
	public Venta addProducto(Venta venta) {
		return iVentaDAO.save(venta);
	}

	@Override
	public Venta getVentaById(Long codigo) {
		return iVentaDAO.findById(codigo).get();
	}

	@Override
	public Venta actualizarVenta(Venta venta) {
		return iVentaDAO.save(venta);
	}

	@Override
	public void deleteVenta(Long codigo) {
		iVentaDAO.deleteById(codigo);
	}

}
