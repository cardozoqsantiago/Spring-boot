package com.spring.prueba.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Modelo para la tabla Usuario
 * 
 * @author SantiagoPC
 *
 */
@Entity
@Table(name = "Usuario")
public class Usuario {
	
	/**
	 * propiedad id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id; 
	
	/**
	 * propiedad nombres
	 */
	@Column(name = "Nombres")
	private String nombres;
	
	/**
	 * propiedad apellidos
	 */
	@Column(name = "Apellidos")
	private String apellidos;
	
	/**
	 * propiedad ciudad
	 */
	@Column(name = "Ciudad")
	private String ciudad;
	
	/**
	 * propiedad cedula
	 */
	@Column(name = "Cedula")
	private String cedula;
	
	/**
	 * propiedad telefono
	 */
	@Column(name = "Telefono")
	private String telefono;
	
	/**
	 * propiedad ocupacion
	 */
	@Column(name = "Ocupacion")
	private String ocupacion;
	
	/**
	 * propiedad fechaNacimiento
	 */
	@Column(name = "FechaNacimiento")
	private LocalDate fechaNacimiento;

	/**
	 * Getter para el campo nombres.
	 *
	 * @return el valor de la propiedad nombres.
	 */
	public String getNombres() {
		return nombres;
	}

	/**
	 * Setter para el campo nombres..
	 *
	 * @param @param nombres el valor de la propiedad nombres a establecer.
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	/**
	 * Getter para el campo apellidos.
	 *
	 * @return el valor de la propiedad apellidos.
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Setter para el campo apellidos..
	 *
	 * @param @param apellidos el valor de la propiedad apellidos a establecer.
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * Getter para el campo ciudad.
	 *
	 * @return el valor de la propiedad ciudad.
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * Setter para el campo ciudad..
	 *
	 * @param @param ciudad el valor de la propiedad ciudad a establecer.
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	/**
	 * Getter para el campo cedula.
	 *
	 * @return el valor de la propiedad cedula.
	 */
	public String getCedula() {
		return cedula;
	}

	/**
	 * Setter para el campo cedula..
	 *
	 * @param @param cedula el valor de la propiedad cedula a establecer.
	 */
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	/**
	 * Getter para el campo telefono.
	 *
	 * @return el valor de la propiedad telefono.
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * Setter para el campo telefono..
	 *
	 * @param @param telefono el valor de la propiedad telefono a establecer.
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * Getter para el campo ocupacion.
	 *
	 * @return el valor de la propiedad ocupacion.
	 */
	public String getOcupacion() {
		return ocupacion;
	}

	/**
	 * Setter para el campo ocupacion..
	 *
	 * @param @param ocupacion el valor de la propiedad ocupacion a establecer.
	 */
	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	/**
	 * Getter para el campo fechaNacimiento.
	 *
	 * @return el valor de la propiedad fechaNacimiento.
	 */
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * Setter para el campo fechaNacimiento..
	 *
	 * @param @param fechaNacimiento el valor de la propiedad fechaNacimiento a establecer.
	 */
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

}
