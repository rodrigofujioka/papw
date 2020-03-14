package com.rodrigofujioka.dev.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigofujioka.dev.domain.Product;
import com.rodrigofujioka.dev.repositoy.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	
	public Product save(Product product) {
		return productRepository.save(product);
	}
	
	public Product findById(Long id) {
		return productRepository
				.findById(id)
				.orElseThrow(NoSuchElementException::new);
	}	
	
	public List<Product> findAll() {
		return productRepository.findAll();
	}
	
	
	public Product update(Product product) {
		if(product.getId()==null) {
			throw new NoSuchFieldError("ID not Present");
		}
		return productRepository.save(product);
	}
	
	//FIXME Exercício para turma :  Implemente os demais métodos (Deletar por ID, Atualizar)

}
