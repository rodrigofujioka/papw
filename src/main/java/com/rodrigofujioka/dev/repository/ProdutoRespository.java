package com.rodrigofujioka.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigofujioka.dev.domain.Produto;

public interface ProdutoRespository 
                      extends JpaRepository<Produto, Integer>{

}
