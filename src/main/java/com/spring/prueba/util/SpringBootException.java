package com.spring.prueba.util;

/**
 * Clase encargada de manejar las excepciones
 * 
 * @author SantiagoPC
 *
 */
public class SpringBootException extends Exception  {
	
	/**
	 * Serial del objeto
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Atributo para tipo error
	 */
	private String tipoError;

	/**
	 * Constructor con las propiedades
	 * 
	 * @param tipoError el valor de la propiedad
	 */
	public SpringBootException(String tipoError, String mensaje) {
		super(mensaje);
		this.tipoError = tipoError;
	}

	/**
	 * Getter para el campo tipoError.
	 *
	 * @return el valor de la propiedad tipoError.
	 */
	public String getTipoError() {
		return tipoError;
	}

	/**
	 * Setter para el campo tipoError..
	 *
	 * @param @param tipoError el valor de la propiedad tipoError a establecer.
	 */
	public void setTipoError(String tipoError) {
		this.tipoError = tipoError;
	}
	
		

}
