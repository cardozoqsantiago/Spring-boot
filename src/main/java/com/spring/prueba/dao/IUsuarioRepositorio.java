package com.spring.prueba.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.prueba.model.Usuario;

/**
 * Repositorio que soportara todas las querys realizadas
 * a la tabla Usuario
 * 
 * @author SantiagoPC
 *
 */
public interface IUsuarioRepositorio extends JpaRepository<Usuario, Long> {

}
