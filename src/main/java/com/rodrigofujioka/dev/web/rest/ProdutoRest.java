package com.rodrigofujioka.dev.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigofujioka.dev.domain.Produto;
import com.rodrigofujioka.dev.repository.ProdutoRespository;

@RestController
@RequestMapping("/api")
public class ProdutoRest {
	
	
	private ProdutoRespository produtoRepository; 
	
	@GetMapping("/produto/{id}")
	public Produto getProdutoById(@PathVariable int id) {
		Produto p = produtoRepository.findById(id).get();
		produtoRepository.save(p);
		produtoRepository.delete(p);
		produtoRepository.deleteById(id);
		
		//Produto p = produtoService.findById(id);
		p.setId(id);
	
		return p;
	}

}
