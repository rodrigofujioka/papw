package com.rodrigofujioka.dev.web.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigofujioka.dev.web.domain.Quarentena;
import com.rodrigofujioka.dev.web.repository.QuarentenaRepository;
import com.rodrigofujioka.dev.web.service.QuarentenaService;
import com.rodrigofujioka.dev.web.service.dto.QuarentenaNomeCidadeDTO;

//www.rodrigofujioka.com
//localhost:8080
//localhost:8080/api
//localhost:8080/api/quarentena

@RestController
@RequestMapping("/api")
public class QuarentenaRest {

	@Autowired
	private QuarentenaService quarentenaService;
	// private QuarentenaRepository quarentenaRepository;

	@GetMapping("/quarentena/{estado}")
	public ResponseEntity<List<Quarentena>> getQuarentena(@PathVariable String estado) {
		return ResponseEntity.ok(quarentenaService.getQuarentenaByUf(estado));
	}

	@PostMapping("/quarentena")
	public ResponseEntity<Quarentena> salvar(@RequestBody @Valid Quarentena quarentena) {
		Quarentena quarentenaSalva = quarentenaService.salvar(quarentena);
		return ResponseEntity.ok().body(quarentenaSalva);
	}

	@GetMapping("/quarentena")
	public ResponseEntity<List<Quarentena>> getQuarentena() {
		return ResponseEntity.ok(quarentenaService.getQuarentena());
	}

	@GetMapping("/quarentena/{id}")
	public ResponseEntity<Quarentena> getQuarentenaById(@PathVariable Long id) {
		try {
			
			return ResponseEntity.ok(quarentenaService.getQuarentenaById(id));
			
		} catch (Exception e) {
			// FIXME INCLUIR LOGS
			return ResponseEntity.notFound().build();
		}

	}
	
	@GetMapping("/quarentena/nome/cidade/{id}")
	public ResponseEntity<QuarentenaNomeCidadeDTO> getQuarentenaNomeCidadeById(@PathVariable Long id) {
		try {			
			return ResponseEntity.ok(quarentenaService.getQuarentenaNomeCidadeById(id));			
		} catch (Exception e) {
			// FIXME INCLUIR LOGS
			return ResponseEntity.notFound().build();
		}

	}
		

	@DeleteMapping("/quarentena/{id}")
	public ResponseEntity deleteById(@PathVariable Long id) {
		try {
			quarentenaService.deleteQuarentenaById(id);
		} catch (Exception e) {
			// FIXME INCLUIR LOGS
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().build();
	}

}
