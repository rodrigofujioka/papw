package com.rodrigofujioka.dev.web.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public List<Product> getProducts() {
		return productService.findAll();
	}
	
	
	@PostMapping("/product")
	public Product save(@RequestBody @Valid Product product) {
		return productService.save(product);
	}
	
	@PutMapping("/product")
	public Product update(@RequestBody @Valid Product product) {
		return productService.update(product);
	}
	
	@DeleteMapping("/product/{id}")
	public ResponseEntity deleteById(@RequestParam Long id) {
		productService.deleteById(id);
		return ResponseEntity.ok().build();
	}
	
	
	
	
	//FIXME Exercício para turma :  Implemente os demais métodos (Deletar por ID, Atualizar)

}
