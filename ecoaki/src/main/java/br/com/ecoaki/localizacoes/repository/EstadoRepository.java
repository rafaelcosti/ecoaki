package br.com.ecoaki.localizacoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ecoaki.localizacoes.entity.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{

}
