package com.rodrigofujioka.dev.web.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigofujioka.dev.web.domain.Disciplina;
import com.rodrigofujioka.dev.web.service.DisciplinaService;

@RestController
@RequestMapping("/api")
public class DisciplinaRest {

	@Autowired
	private DisciplinaService disciplinaService;

	@PostMapping("/disciplina")
	public ResponseEntity<Disciplina> salvar(@RequestBody @Valid Disciplina disciplina) {
		return ResponseEntity.ok(disciplinaService.salvar(disciplina));
	}
	
	@PutMapping("/disciplina")
	public Disciplina update(@RequestBody @Valid Disciplina disciplina) {
		return disciplinaService.update(disciplina);
	}
	

	@GetMapping("/disciplina/{id}")
	public Disciplina consultaPorId(@PathVariable Long id) {
		return disciplinaService.consultaPorId(id);
	}
	
	@GetMapping("/disciplina")
	public List<Disciplina> listar() {
		return disciplinaService.listar();
	}

	@DeleteMapping("/disciplina/{id}")
	public ResponseEntity deletePorId(@PathVariable Long id) {
		try {
			disciplinaService.deletePorId(id);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.badRequest().build();
		}

	}
	
	
	
	
	

}
