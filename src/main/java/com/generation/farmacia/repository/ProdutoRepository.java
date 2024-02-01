package com.generation.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import  com.generation.farmacia.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
    public List<Produto> findAllByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);
	
    public List<Produto> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
    
    public List<Produto> findByPrecoLessThanEqual(@Param("preco")Double preco);
    
    public List<Produto> findByPrecoBetween(@Param("precoMin")Double precoMin, @Param("precoMax")Double precoMax);

}
