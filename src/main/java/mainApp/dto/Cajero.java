package mainApp.dto;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "cajero")
public class Cajero {

	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	// @Column(name="nom_apels")
	private String nom_apels;
	
	@OneToMany
	@JoinColumn(name="codigo")
	private List<Venta> ventas;

	//CONSTRUCTORES
	public Cajero() {
	}

	public Cajero(Long codigo, String nom_apels, List<Venta> ventas) {
		super();
		this.codigo = codigo;
		this.nom_apels = nom_apels;
		this.ventas = ventas;
	}

	// GETTERS & SETTERS
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNom_apels() {
		return nom_apels;
	}

	public void setNom_apels(String nom_apels) {
		this.nom_apels = nom_apels;
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
		return "Cajero [codigo=" + codigo + ", nom_apels=" + nom_apels + ", ventas=" + ventas + "]";
	}

}
