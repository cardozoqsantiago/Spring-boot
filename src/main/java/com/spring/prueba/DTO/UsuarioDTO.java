package com.spring.prueba.DTO;

import java.time.LocalDate;

/**
 * Pojo para la gestion de un Usuario
 * 
 * @author SantiagoPC
 *
 */
public class UsuarioDTO {
	
	/**
	 * propiedad id
	 */
	private Long id; 
	
	/**
	 * propiedad nombres
	 */
	private String nombres;
	
	/**
	 * propiedad apellidos
	 */
	private String apellidos;
	
	/**
	 * propiedad ciudad
	 */
	private String ciudad;
	
	/**
	 * propiedad cedula
	 */
	private String cedula;
	
	/**
	 * propiedad telefono
	 */
	private String telefono;
	
	/**
	 * propiedad ocupacion
	 */
	private String ocupacion;
	
	/**
	 * propiedad fechaNacimiento
	 */
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

	/**
	 * Getter para el campo id.
	 *
	 * @return el valor de la propiedad id.
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Setter para el campo id..
	 *
	 * @param @param id el valor de la propiedad id a establecer.
	 */
	public void setId(Long id) {
		this.id = id;
	}	
}
