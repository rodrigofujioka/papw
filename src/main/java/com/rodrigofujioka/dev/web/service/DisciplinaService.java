package com.rodrigofujioka.dev.web.service;

import java.util.List;

import javax.naming.directory.NoSuchAttributeException;
import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigofujioka.dev.web.domain.Disciplina;
import com.rodrigofujioka.dev.web.repository.DisciplinaRepository;

import javassist.NotFoundException;

@Service
public class DisciplinaService {
	
	@Autowired
	private DisciplinaRepository disciplinaRepository;
	
	
	public Disciplina salvar(Disciplina disciplina) {		
		return disciplinaRepository.save(disciplina);
	}
	
	public Disciplina consultaPorId(Long id) {
		return disciplinaRepository.findById(id).get();				
	}
	
	public void deletePorId(Long id) {
		disciplinaRepository.deleteById(id);
	}
	
	public List<Disciplina> listar(){
		return disciplinaRepository.findAll();
	}
	
	public Disciplina update(Disciplina disciplina) {
		if(disciplina!=null) {
			return disciplinaRepository.save(disciplina);
		}
		throw new RuntimeException("ID precisar ser informado");
	}
	

}
