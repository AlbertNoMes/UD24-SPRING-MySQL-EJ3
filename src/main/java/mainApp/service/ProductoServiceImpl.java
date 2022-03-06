package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import mainApp.dao.IProductoDAO;
import mainApp.dto.Producto;

public class ProductoServiceImpl implements IProductoService{

	@Autowired
	IProductoDAO iProductoDAO;
	
	@Override
	public List<Producto> listaProductos() {
		return iProductoDAO.findAll();
	}

	@Override
	public Producto addProducto(Producto producto) {
		return iProductoDAO.save(producto);
	}

	@Override
	public Producto getProductoById(Long codigo) {
		return iProductoDAO.findById(codigo).get();
	}

	@Override
	public Producto actualizarProducto(Producto producto) {
		return iProductoDAO.save(producto);
	}

	@Override
	public void deleteProducto(Long codigo) {
		iProductoDAO.deleteById(codigo);		
	}

}
