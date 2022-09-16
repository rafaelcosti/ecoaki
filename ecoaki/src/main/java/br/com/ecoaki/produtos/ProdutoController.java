package br.com.ecoaki.produtos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Api(value = "/produto", tags = {"Produto adicionado"})
@RequestMapping("/produto")
@RestController
public class ProdutoController {
	@Autowired
	private ProdutosService servico;

	@PostMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ProdutoIdDTO> incluir(@RequestBody ProdutoDTO produto) {
		return new ResponseEntity<ProdutoIdDTO>(this.servico.incluir(produto), HttpStatus.CREATED);
	}

	@PutMapping(value = "/{id}")
	public void alterar(@RequestBody ProdutoDTO produto, @PathVariable("id") Long id) {
		produto.setIdProduto(id);
		this.servico.alterar(produto);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<ProdutoDTO> obter(@PathVariable("id") Long id) {
		return new ResponseEntity<ProdutoDTO>(this.servico.obter(id), HttpStatus.OK);
	}

	@DeleteMapping(value = "/{id}")
	public void apagar(@PathVariable("id") Long id) {
		this.servico.apagar(id);
	}

	@GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE, name = "Lista todas as categorias ativas")
	public ResponseEntity<List<ProdutoDTO>> listar() {
		return new ResponseEntity<List<ProdutoDTO>>(this.servico.listar(), HttpStatus.OK);
	}
}
