package br.com.ecoaki.produtos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ecoaki.produtos.entity.Produto;
import br.com.ecoaki.produtos.repository.ProdutosRepository;

@Service
public class ProdutosService {

	@Autowired
	private ProdutosRepository repository;

	public ProdutoIdDTO incluir(ProdutoDTO produto) {
		produto.setDtInclusao(LocalDateTime.now());
		
		ProdutoIdDTO retorno = new ProdutoIdDTO();
		retorno.setId(this.repository.save(new Produto(null, produto.getNomeProduto(), produto.getDescricaoProduto(),
				produto.isAtiva(), produto.getDtInclusao(), produto.getDtExclusao(), produto.getDtAlteracao(),
				produto.getDiasExpiracao())).getIdProduto());
		return retorno;
	}

	public void alterar(ProdutoDTO produto) {
		produto.setDtAlteracao(LocalDateTime.now());
		this.repository.save(new Produto(produto.getIdProduto(), produto.getNomeProduto(),
				produto.getDescricaoProduto(), produto.isAtiva(), produto.getDtInclusao(), produto.getDtExclusao(),
				produto.getDtAlteracao(), produto.getDiasExpiracao())).getIdProduto();
	}

	public void apagar(Long id) {
		this.repository.deleteById(id);
	}

	public ProdutoDTO obter(Long id) {
		Produto produto = this.repository.findById(id).get();

		return new ProdutoDTO(produto.getIdProduto(), produto.getNomeProduto(), produto.getDescricaoProduto(),
				produto.isAtiva(), produto.getDtInclusao(), produto.getDtExclusao(), produto.getDtAlteracao(),
				produto.getDiasExpiracao());
	}

	public List<ProdutoDTO> listar() {
		List<ProdutoDTO> listaRetorno = new ArrayList<ProdutoDTO>();
		List<Produto> list = this.repository.findAll();

		if (list != null) {
			for (Produto produto : list) {
				listaRetorno.add(new ProdutoDTO(produto.getIdProduto(), produto.getNomeProduto(),
						produto.getDescricaoProduto(), produto.isAtiva(), produto.getDtInclusao(),
						produto.getDtExclusao(), produto.getDtAlteracao(), produto.getDiasExpiracao()));
			}
		}

		return listaRetorno;
	}
}
