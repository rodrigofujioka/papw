package com.rodrigofujioka.dev.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigofujioka.dev.domain.Usuario;

@RestController
@RequestMapping("/api")
public class UsuarioResource {
	
	@GetMapping("/usuario/{id}")
	public ResponseEntity<Usuario> getUsuario(@PathVariable int id) {
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		usuario.setNomeCompleto("Rodrigo Fujioka");
		
		return ResponseEntity.ok(usuario);
	}
	
	@DeleteMapping
	public void delete() {
		
	}

}
