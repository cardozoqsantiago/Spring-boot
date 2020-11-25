package com.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.model.Usuario;

/**
 * Repositorio que soportara todas las querys realizadas
 * a la tabla Usuario
 * 
 * @author SantiagoPC
 *
 */
public interface IUsuarioRepositorio extends JpaRepository<Usuario, Long> {

}
