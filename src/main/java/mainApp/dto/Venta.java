package mainApp.dto;

import javax.persistence.*;

@Entity
@Table(name="ventas")
public class Venta {
	
	// ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="codigo_cajero")
	private Cajero obj_cajero;
	
	@ManyToOne
	@JoinColumn(name="codigo_producto")
	private Cajero obj_producto;
	
	@ManyToOne
	@JoinColumn(name="codigo_maquina")
	private Cajero obj_maquina;

	// CONSTRUCTORES
	public Venta() {
	}

	public Venta(Long id, Cajero obj_cajero, Cajero obj_producto, Cajero obj_maquina) {
		super();
		this.id = id;
		this.obj_cajero = obj_cajero;
		this.obj_producto = obj_producto;
		this.obj_maquina = obj_maquina;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cajero getObj_cajero() {
		return obj_cajero;
	}

	public void setObj_cajero(Cajero obj_cajero) {
		this.obj_cajero = obj_cajero;
	}

	public Cajero getObj_producto() {
		return obj_producto;
	}

	public void setObj_producto(Cajero obj_producto) {
		this.obj_producto = obj_producto;
	}

	public Cajero getObj_maquina() {
		return obj_maquina;
	}

	public void setObj_maquina(Cajero obj_maquina) {
		this.obj_maquina = obj_maquina;
	}

	// METODO TOSTRING
	@Override
	public String toString() {
		return "Venta [id=" + id + ", obj_cajero=" + obj_cajero + ", obj_producto=" + obj_producto + ", obj_maquina="
				+ obj_maquina + "]";
	}

}
