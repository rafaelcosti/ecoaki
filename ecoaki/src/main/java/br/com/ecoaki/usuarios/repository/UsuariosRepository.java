package br.com.ecoaki.usuarios.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ecoaki.usuarios.entity.Usuario;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuario, Integer> {

	}





