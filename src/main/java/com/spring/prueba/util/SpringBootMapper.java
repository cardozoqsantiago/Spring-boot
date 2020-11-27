package com.spring.prueba.util;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

import com.spring.prueba.DTO.UsuarioDTO;
import com.spring.prueba.model.Usuario;

/**
 * Clase que se encarga de mapear entidades a Dtos y viceversa
 * 
 * @author SantiagoPC
 *
 */
public class SpringBootMapper {
	
	/**
	 * Metodo que mapea un UsuarioDTO a su respectiva entidad
	 * 
	 * @param usuario
	 * @return
	 */
	public static UsuarioDTO toUsuarioDTO(Usuario usuario) {
		ModelMapper modelMapper = new ModelMapper();
		PropertyMap<Usuario, UsuarioDTO> usuarioMap = new PropertyMap<Usuario, UsuarioDTO>() {
			@Override
			protected void configure() {
				//optional
			}
		};
		modelMapper.addMappings(usuarioMap);
		return modelMapper.map(usuario, UsuarioDTO.class);	
	}
	
	/**
	 * Metodo que mapea una Usuario a su respectivo DTO
	 * 
	 * @param usuarioDTO
	 * @return
	 */
	public static Usuario toUsuario(UsuarioDTO usuarioDTO) {
		ModelMapper modelMapper = new ModelMapper();
		PropertyMap<UsuarioDTO, Usuario> usuarioDTOMap = new PropertyMap<UsuarioDTO, Usuario>() {
			@Override
			protected void configure() {
			}
		};
		modelMapper.addMappings(usuarioDTOMap);
		return modelMapper.map(usuarioDTO, Usuario.class);
	}

}
