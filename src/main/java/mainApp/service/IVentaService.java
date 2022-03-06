package mainApp.service;

import java.util.List;

import mainApp.dto.Venta;

public interface IVentaService {

	// METODOS DEL CRUD
	public List<Venta> listaVentas(); // LISTAR TODOS LAS VENTAS

	public Venta addProducto(Venta venta); // ADD NUEVA VENTA

	public Venta getVentaById(Long codigo); // GET VENTA BY ID

	public Venta actualizarVenta(Venta venta); // ACTUALIZA DATOS DE LA VENTA

	public void deleteVenta(Long codigo); // ELIMINA LA VENTA
	
}
