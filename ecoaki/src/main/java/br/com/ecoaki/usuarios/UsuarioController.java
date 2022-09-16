package br.com.ecoaki.usuarios;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Api(value = "/usuarios", tags = {"Usuarios"})
@RequestMapping("/usuarios")
@RestController
public class UsuarioController {

		@Autowired
		private UsuarioService servico;
		
		@PostMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
		public void incluir(@RequestBody UsuariosDTO produtoCategoria) {
			this.servico.incluir(produtoCategoria);
		}
		
		@PutMapping(value = "/{id}")
		public void alterar(@RequestBody UsuariosDTO usuarios, @PathVariable("id")Integer id) {
			usuarios.setIdUsuarios(id);
			this.servico.alterar(usuarios);
		}
		
		@GetMapping(value = "/{id}")
		public UsuariosDTO obter(@PathVariable("id") Integer id) {
			return this.servico.obter(id);
		}
		
		@DeleteMapping(value = "/{id}")
		public void apagar(@PathVariable("id")Integer id) {
			this.servico.apagar(id);
		}
		
		@GetMapping(value = "/listar", produces = MediaType.APPLICATION_JSON_VALUE, name = "Lista todos os usuários")
		public List<UsuariosDTO> listar() {
			return this.servico.listar();
		}
	}
