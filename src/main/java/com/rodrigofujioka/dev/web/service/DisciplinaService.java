package com.rodrigofujioka.dev.web.service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.naming.directory.NoSuchAttributeException;
import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigofujioka.dev.web.domain.Disciplina;
import com.rodrigofujioka.dev.web.repository.DisciplinaRepository;
import com.rodrigofujioka.dev.web.service.dto.DisciplinaNomeProfessorDTO;

import javassist.NotFoundException;

@Service
public class DisciplinaService {
	
	@Autowired
	private DisciplinaRepository disciplinaRepository;
	
	
	public List<Disciplina> getDisciplinaByNomeAndProfessor(String nome, String professor) {
		
		/*
		 * Set<Disciplina> lista = new
		 * HashSet<Disciplina>(disciplinaRepository.findDisciplinaByNomeAndProfessor(
		 * nome, professor));
		 */
				
		return disciplinaRepository.findDisciplinaByNomeAndProfessor(nome, professor);				
		
	}
	
	public DisciplinaNomeProfessorDTO getDisciplinaPorId(Long id) throws NotFoundException {
		 Optional<Disciplina> disciplina = disciplinaRepository.findById(id);
		 if(!disciplina.isEmpty())
			 throw new NotFoundException("Disciplina não localizada");
		
		return new DisciplinaNomeProfessorDTO(disciplina.get());
		
	}
	
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
