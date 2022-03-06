package mainApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mainApp.dto.Producto;
import mainApp.service.ProductoServiceImpl;

@RestController
@RequestMapping("/api")
public class ProductoController {
	
	@Autowired
	ProductoServiceImpl productoServiceImpl;
	
	// MAPEAMOS LOS METODOS DEL ServiceImpl
	@GetMapping("/producto") // PERMITE LISTAR LOS PRODUCTOS CON EL /api/producto EN EL POSTMAN
	public List<Producto> listaProducto(){
		return productoServiceImpl.listaProductos();
	}
	
	@PostMapping("/producto") // PARA AÑADIR UN PRODUCTO
	public Producto saveProducto(@RequestBody Producto producto) {
		return productoServiceImpl.addProducto(producto);
	}
	
	@GetMapping("/producto/{codigo}") // PARA LISTAR POR codigo
	public Producto productoById(@PathVariable(name = "codigo") Long codigo) {
		return productoServiceImpl.getProductoById(codigo);
	}
	
	@PutMapping("/producto/{codigo}") // PARA ACTUALIZAR POR codigo
	public Producto actualizarProducto(@PathVariable(name = "codigo") Long codigo, @RequestBody Producto producto) {
		Producto producto_seleccionado = new Producto();
		Producto producto_actualizado = new Producto();

		producto_seleccionado = productoServiceImpl.getProductoById(codigo);

		producto_actualizado = productoServiceImpl.actualizarProducto(producto_seleccionado);

		System.out.println("El producto actualizado es: " + producto_actualizado);

		return producto_actualizado;
	}
	
	@DeleteMapping("/producto/{codigo}") // PARA BORRAR POR codigo
	public void deleteProducto(@PathVariable(name = "codigo") Long codigo) {
		productoServiceImpl.deleteProducto(codigo);
	}

}
