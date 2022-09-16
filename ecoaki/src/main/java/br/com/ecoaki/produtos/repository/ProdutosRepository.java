package br.com.ecoaki.produtos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ecoaki.produtos.entity.Produto;

@Repository
public interface ProdutosRepository extends JpaRepository<Produto, Long>{

}
