package com.spring.prueba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.prueba.DTO.UsuarioDTO;
import com.spring.prueba.dao.IUsuarioRepositorio;
import com.spring.prueba.util.SpringBootException;
import com.spring.prueba.util.SpringBootMapper;

/**
 * Servicio que mandeja toda la logica de negocio 
 * necesaria para un usuario
 * 
 * @author SantiagoPC
 *
 */
@Service
public class UsuarioService implements IUsuarioService {
	
	/**
	 * Inyeccion del repositorio IUsuarioRepositorio a traves
	 * del atributo usuarioRepository
	 */
	@Autowired
	private IUsuarioRepositorio usuarioRepository;
	
	/**
	 * Metodo que permite crear un usuario
	 * 
	 * @param usuarioDTO
	 */
	@Override
	public void crearUsuario(UsuarioDTO usuarioDTO) throws SpringBootException {
		usuarioRepository.save(SpringBootMapper.toUsuario(usuarioDTO));
	}

}
