package com.rodrigofujioka.dev.web.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigofujioka.dev.web.domain.Quarentena;
import com.rodrigofujioka.dev.web.repository.QuarentenaRepository;
import com.rodrigofujioka.dev.web.service.QuarentenaService;

//www.rodrigofujioka.com
//localhost:8080
//localhost:8080/api
//localhost:8080/api/quarentena

@RestController
@RequestMapping("/api")
public class QuarentenaRest {
	
	@Autowired
	private QuarentenaService quarentenaService;
	//private QuarentenaRepository quarentenaRepository;
		
	@GetMapping("/quarentena/{estado}")
	public List<Quarentena> getQuarentena(@PathVariable  String estado) {
		return quarentenaService.getQuarentenaByUf(estado);
	}

	@PostMapping("/quarentena")
	public Quarentena salvar(@RequestBody @Valid Quarentena quarentena) {
		Quarentena quarentenaSalva = quarentenaService.salvar(quarentena);
		return quarentenaSalva;
	}
	
	@GetMapping("/quarentena")
	public List<Quarentena> getQuarentena(){
		return quarentenaService.getQuarentena();
	}
	
	

}
