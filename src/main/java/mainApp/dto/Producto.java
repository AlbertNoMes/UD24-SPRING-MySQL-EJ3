package mainApp.dto;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="producto")
public class Producto {
	
	// ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	private String nombre;
	private int precio;
	
	@OneToMany
	@JoinColumn(name="codigo")
	private List<Venta> ventas;

	// CONSTRUCTORES
	public Producto() {
	}

	public Producto(Long codigo, String nombre, int precio, List<Venta> ventas) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.ventas = ventas;
	}

	// GETTERS & SETTERS
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@JsonIgnore
	@OneToMany(fetch=FetchType.LAZY, mappedBy="Venta")
	public List<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}

	// METODO TOSTRING
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", ventas=" + ventas + "]";
	}

}
