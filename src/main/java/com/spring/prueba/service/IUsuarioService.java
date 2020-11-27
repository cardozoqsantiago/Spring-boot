package com.spring.prueba.service;

import com.spring.prueba.DTO.UsuarioDTO;
import com.spring.prueba.util.SpringBootException;

/**
 * Interface para el negocio UsuarioService
 * 
 * @author SantiagoPC
 *
 */
public interface IUsuarioService {

	/**
	 * Metodo que permite crear un usuario
	 * 
	 * @param usuarioDTO
	 */
	void crearUsuario(UsuarioDTO usuarioDTO) throws SpringBootException;

}
