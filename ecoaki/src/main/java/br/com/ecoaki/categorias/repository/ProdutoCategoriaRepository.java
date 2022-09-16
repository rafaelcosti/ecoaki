package br.com.ecoaki.categorias.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ecoaki.categorias.entity.ProdutoCategoria;

@Repository
public interface ProdutoCategoriaRepository extends JpaRepository<ProdutoCategoria, Integer> {

}
