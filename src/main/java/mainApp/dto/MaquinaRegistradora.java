package mainApp.dto;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="maquina_registradora")
public class MaquinaRegistradora {
	
	// ATRIBUTOS
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codigo;
	
	private int piso;

	@OneToMany
	@JoinColumn(name="codigo")
	private List<Venta> ventas;

	// CONSTRUCTORES
	public MaquinaRegistradora() {
	}

	public MaquinaRegistradora(Long codigo, int piso, List<Venta> ventas) {
		super();
		this.codigo = codigo;
		this.piso = piso;
		this.ventas = ventas;
	}

	// GETTERS & SETTERS
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
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
		return "MaquinasRegistradoras [codigo=" + codigo + ", piso=" + piso + ", ventas=" + ventas + "]";
	}

}
