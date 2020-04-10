package com.rodrigofujioka.dev.web.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

@Entity
@DiscriminatorValue("1")
public class PessoaFisica extends Pessoa {

	@NotEmpty
	private String cpf;
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
		
}
