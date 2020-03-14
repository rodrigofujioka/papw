package com.rodrigofujioka.dev.web.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigofujioka.dev.domain.Product;
import com.rodrigofujioka.dev.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductRest {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/product/{id}")
	public Product getProductById(Long id) {
		return productService.findById(id);
	}
	
	@GetMapping("/product")
	public List<Product> getProductsId() {
		return productService.findAll();
	}
	
	
	@PostMapping("/product")
	public Product save(@RequestBody @Valid Product product) {
		return productService.save(product);
	}
	
	//FIXME Exercício para turma :  Implemente os demais métodos (Deletar por ID, Atualizar)

}
