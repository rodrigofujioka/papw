/**
 * 
 */
package com.rodrigofujioka.dev.web.service.dto;

import com.rodrigofujioka.dev.web.domain.Produto;

/**
 * @author rodri
 *
 */
public class ProdutoDTO {

	private Long id;
	private String nome;
	private String marca;
	
	public ProdutoDTO(Produto produto) {
		this.id = produto.getId();
		this.nome = produto.getNome();
		this.marca = produto.getMarca();
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	
	
	
}
