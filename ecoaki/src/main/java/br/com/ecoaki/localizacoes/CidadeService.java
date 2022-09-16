package br.com.ecoaki.localizacoes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ecoaki.localizacoes.entity.Cidade;
import br.com.ecoaki.localizacoes.repository.CidadeRepository;



@Service
public class CidadeService {

	@Autowired
	private CidadeRepository repository;
	
	public void incluir(CidadeDTO cidade) {
		
		this.repository.save(new Cidade(null, cidade.getNomeCidade(), cidade.isAtiva()))
				.getIdCidade();
	}
	
	public void alterar(CidadeDTO cidade) {

		this.repository.save(new Cidade(cidade.getIdCidade(), cidade.getNomeCidade()
				, cidade.isAtiva())).getIdCidade();
	}
	
	public void apagar(Integer id) {
		this.repository.deleteById(id);;
	}
	
	public CidadeDTO obter(Integer id) {
		Cidade cidade = this.repository.findById(id).get();
		
		return new CidadeDTO(cidade.getIdCidade()
				, cidade.getNomeCidade()
				, cidade.isAtiva());
	}
	
	public List<CidadeDTO> listar() {
		List<CidadeDTO> listaRetorno = new ArrayList<CidadeDTO>();
		List<Cidade> list = this.repository.findAll();
		
		if (list != null) {
			for (Cidade cidade : list) {
				listaRetorno.add(new CidadeDTO(cidade.getIdCidade()
						, cidade.getNomeCidade()
						, cidade.isAtiva()));
			}
		}
	
		return listaRetorno;
	}	
	
	
	
	
	
}
