package br.com.ecoaki.categorias;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ecoaki.categorias.entity.ProdutoCategoria;
import br.com.ecoaki.categorias.repository.ProdutoCategoriaRepository;

@Service
public class ProdutoCategoriaService {
	/**
	 * 
	 */
	@Autowired
	private ProdutoCategoriaRepository repository;
	
	public void incluir(ProdutoCategoriaDTO prodCat) {
		
		this.repository.save(new ProdutoCategoria(null, prodCat.getNomeCategoria(), prodCat.isAtiva()))
				.getIdCategoria();
	}
	
	public void alterar(ProdutoCategoriaDTO prodCat) {

		this.repository.save(new ProdutoCategoria(prodCat.getIdCategoria(), prodCat.getNomeCategoria()
				, prodCat.isAtiva())).getIdCategoria();
	}
	
	public void apagar(Integer id) {
		this.repository.deleteById(id);;
	}
	
	public ProdutoCategoriaDTO obter(Integer id) {
		ProdutoCategoria categoria = this.repository.findById(id).get();
		
		return new ProdutoCategoriaDTO(categoria.getIdCategoria()
				, categoria.getNomeCategoria()
				, categoria.isAtiva());
	}
	
	public List<ProdutoCategoriaDTO> listar() {
		List<ProdutoCategoriaDTO> listaRetorno = new ArrayList<ProdutoCategoriaDTO>();
		List<ProdutoCategoria> list = this.repository.findAll();
		
		if (list != null) {
			for (ProdutoCategoria categoria : list) {
				listaRetorno.add(new ProdutoCategoriaDTO(categoria.getIdCategoria()
						, categoria.getNomeCategoria()
						, categoria.isAtiva()));
			}
		}
	
		return listaRetorno;
	}
}
