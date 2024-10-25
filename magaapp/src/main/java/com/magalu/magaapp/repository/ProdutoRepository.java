package com.magalu.magaapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magalu.magaapp.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
