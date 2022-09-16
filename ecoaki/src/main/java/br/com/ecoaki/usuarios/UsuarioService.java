package br.com.ecoaki.usuarios;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ecoaki.usuarios.entity.Usuario;
import br.com.ecoaki.usuarios.repository.UsuariosRepository;
@Service
public class UsuarioService {
	/**
	 * 
	 */
	@Autowired
	private UsuariosRepository repository;
	
	public void incluir(UsuariosDTO user) {
		
		this.repository.save(new Usuario(null, user.getName(),user.getEmail(),user.getPassword()));
	}
	
	public void alterar(UsuariosDTO user) {

		this.repository.save(new Usuario(user.getIdUsuarios(), user.getName(),user.getEmail(),user.getPassword())).getIdUsuarios();
	}
	
	public void apagar(Integer id) {
		this.repository.deleteById(id);;
	}
	
	public UsuariosDTO obter(Integer id) {
		Usuario user = this.repository.findById(id).get();
		
		return new UsuariosDTO(user.getIdUsuarios(), user.getName(),user.getEmail(),user.getPassword());
	}
	
	public List<UsuariosDTO> listar() {
		List<UsuariosDTO> listaRetorno = new ArrayList<UsuariosDTO>();
		List<Usuario> list = this.repository.findAll();
		
		if (list != null) {
			for (Usuario user : list) {
				listaRetorno.add(new UsuariosDTO(user.getIdUsuarios()
						, user.getName()
						,user.getEmail()
						,user.getPassword()
						));
			}
		}
	
		return listaRetorno;
	}
}
