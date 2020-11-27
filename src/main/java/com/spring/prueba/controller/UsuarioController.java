package com.spring.prueba.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.prueba.DTO.UsuarioDTO;
import com.spring.prueba.service.IUsuarioService;
import com.spring.prueba.util.ConstantesUtils;
import com.spring.prueba.util.SpringBootException;

/**
 * Controlador para la gestion de un
 * usuario
 * 
 * @author SantiagoPC
 *
 */
//@CrossOrigin(origins = "http://localhost:8080")
@RestController
//@RequestMapping("/usuario")
public class UsuarioController  {
	
	private IUsuarioService usuarioService;
	
	/**
	 * Permite crear un usuario 
	 * 
	 * @param usuarioDTO
	 * @throws SpringBootException 
	 */
	@PostMapping("/crearUsuario")
	public ResponseEntity<String> crearUsuario(@RequestBody UsuarioDTO usuarioDTO) throws SpringBootException {
		try {
			usuarioService.crearUsuario(usuarioDTO);
			return new ResponseEntity<>(ConstantesUtils.EXITOSO + ": Se creo el usuario correctamente.", HttpStatus.OK);
		} catch (SpringBootException e) {
			throw new SpringBootException(ConstantesUtils.ERROR_TECNICO, ConstantesUtils.NO_CREO_USUARIO + e);
		}
	}
	
	@GetMapping("/prueba")
	public String mensaje() {
		return "hola";
	}

}
