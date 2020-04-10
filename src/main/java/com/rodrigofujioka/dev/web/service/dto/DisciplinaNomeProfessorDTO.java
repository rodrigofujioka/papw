package com.rodrigofujioka.dev.web.service.dto;

import com.rodrigofujioka.dev.web.domain.Disciplina;

public class DisciplinaNomeProfessorDTO {
	
	private String nome;
	private String professor;
	
	public DisciplinaNomeProfessorDTO(Disciplina disciplina) {
		this.nome=disciplina.getNome();
		this.professor=disciplina.getProfessor();
	}		
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}
	
	
	
	
	

}
