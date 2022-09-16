package br.com.ecoaki.categorias;

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

/**
 * Controle de categoria de produtos
 * 
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 17/04/2022 - Version 1.0.0
 */
//@Api(value = "/produto/categoria", tags = {"Categoria de produtos"})
@RequestMapping("/produto/categoria")
@RestController
public class ProdutoCategoriaController {
	/**
	 * 
	 */
	@Autowired
	private ProdutoCategoriaService servico;
	
	@PostMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void incluir(@RequestBody ProdutoCategoriaDTO produtoCategoria) {
		this.servico.incluir(produtoCategoria);
	}
	
	@PutMapping(value = "/{id}")
	public void alterar(@RequestBody ProdutoCategoriaDTO produtoCategoria, @PathVariable("id")Integer id) {
		produtoCategoria.setIdCategoria(id);
		this.servico.alterar(produtoCategoria);
	}
	
	@GetMapping(value = "/{id}")
	public ProdutoCategoriaDTO obter(@PathVariable("id") Integer id) {
		return this.servico.obter(id);
	}
	
	@DeleteMapping(value = "/{id}")
	public void apagar(@PathVariable("id")Integer id) {
		this.servico.apagar(id);
	}
	
	@GetMapping(value = "/listar", produces = MediaType.APPLICATION_JSON_VALUE, name = "Lista todas as categorias ativas")
	public List<ProdutoCategoriaDTO> listar() {
		return this.servico.listar();
	}
}
