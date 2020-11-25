package com.spring.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador para la gestion de un
 * usuario
 * 
 * @author SantiagoPC
 *
 */
@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/usuario")
public class UsuarioController implements IUsuarioController {

}
