package br.com.ecoaki.localizacoes;

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


//@Api(value = "/Estado", tags = {"Estados do Brasil"})
@RequestMapping(value = "/estado")
@RestController
public class EstadoController {

	@Autowired
	private EstadoService servico;
	
	@PostMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void incluir(@RequestBody EstadoDTO estado) {
		this.servico.incluir(estado);
	}
	
	@PutMapping(value = "/{id}")
	public void alterar(@RequestBody EstadoDTO estado, @PathVariable("id")Integer id) {
		estado.setIdEstado(id);
		this.servico.alterar(estado);
	}
	
	@GetMapping(value = "/{id}")
	public EstadoDTO obter(@PathVariable("id") Integer id) {
		return this.servico.obter(id);
	}
	
	@DeleteMapping(value = "/{id}")
	public void apagar(@PathVariable("id")Integer id) {
		this.servico.apagar(id);
	}
	
	@GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE, name = "Lista todos os estados ativos")
	public List<EstadoDTO> listar() {
		return this.servico.listar();
	}
}
