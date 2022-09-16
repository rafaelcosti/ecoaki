package br.com.ecoaki.localizacoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ecoaki.localizacoes.entity.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer>{

}
