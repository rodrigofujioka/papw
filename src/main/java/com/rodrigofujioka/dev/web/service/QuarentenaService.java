package com.rodrigofujioka.dev.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigofujioka.dev.web.domain.Quarentena;
import com.rodrigofujioka.dev.web.repository.QuarentenaRepository;

@Service
public class QuarentenaService {
	
	@Autowired
	private QuarentenaRepository quarentenaRepository;

	
	public Quarentena salvar(Quarentena quarentena) {	
		
		if(quarentena.getUf().equalsIgnoreCase("PB")) {
			throw new RuntimeException("Estado não possui teste");
		}		
		
		return quarentenaRepository.save(quarentena);
	}
	
	public List<Quarentena> getQuarentenaByUf(String uf) {		
		return quarentenaRepository.findQuarentenaByUf(uf);		
	}
	
	public List<Quarentena> getQuarentena(){
		return quarentenaRepository.findAll();
	}
	
	

}
