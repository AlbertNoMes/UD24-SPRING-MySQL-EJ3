package mainApp.service;

import java.util.List;

import mainApp.dto.Producto;

public interface IProductoService {
	
	// METODOS DEL CRUD
	public List<Producto> listaProductos(); // LISTAR TODOS LOS PRODUCTOS

	public Producto addProducto(Producto producto); // ADD NUEVO PRODUCTO

	public Producto getProductoById(Long codigo); // GET PRODUCTO BY ID

	public Producto actualizarProducto(Producto producto); // ACTUALIZA DATOS DEL PRDUCTO

	public void deleteProducto(Long codigo); // ELIMINA EL PRODUCTO

}
