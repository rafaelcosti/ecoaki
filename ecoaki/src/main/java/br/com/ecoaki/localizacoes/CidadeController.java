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


//@Api(value = "/cidade", tags = {"Cidades"})
@RequestMapping("/cidade")
@RestController
public class CidadeController {

	@Autowired
	private CidadeService servico;
	
	@PostMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void incluir(@RequestBody CidadeDTO cidade) {
		this.servico.incluir(cidade);
	}
	
	@PutMapping(value = "/{id}")
	public void alterar(@RequestBody CidadeDTO cidade, @PathVariable("id")Integer id) {
		cidade.setIdCidade(id);
		this.servico.alterar(cidade);
		}
	
	@GetMapping(value = "/{id}")
	public CidadeDTO obter(@PathVariable("id") Integer id) {
		return this.servico.obter(id);
	}	
	
	
	@DeleteMapping(value = "/{id}")
	public void apagar(@PathVariable("id")Integer id) {
		this.servico.apagar(id);
	}
	
	@GetMapping(value = "/listar", produces = MediaType.APPLICATION_JSON_VALUE, name = "Listar todas as cidades ativas")
	public List<CidadeDTO> listar() {
		return this.servico.listar();
	}
}
