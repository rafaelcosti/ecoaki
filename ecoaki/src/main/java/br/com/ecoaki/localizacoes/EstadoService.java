package br.com.ecoaki.localizacoes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ecoaki.localizacoes.entity.Estado;
import br.com.ecoaki.localizacoes.repository.EstadoRepository;

@Service
public class EstadoService {

	@Autowired
	private EstadoRepository repository;

	public void incluir(EstadoDTO estado) {

		this.repository.save(new Estado(null, estado.getNomeEstado(), estado.isAtiva(), estado.getCdEstado()))
				.getIdEstado();
	}

	public void alterar(EstadoDTO estado) {

		this.repository
				.save(new Estado(estado.getIdEstado(), estado.getNomeEstado(), estado.isAtiva(), estado.getCdEstado()))
				.getIdEstado();
	}

	public void apagar(Integer id) {
		this.repository.deleteById(id);
		;
	}

	public EstadoDTO obter(Integer id) {
		Estado estado = this.repository.findById(id).get();

		return new EstadoDTO(estado.getIdEstado(), estado.getNomeEstado(), estado.isAtiva(), estado.getCdEstado());
	}

	public List<EstadoDTO> listar() {
		List<EstadoDTO> listaRetorno = new ArrayList<EstadoDTO>();
		List<Estado> list = this.repository.findAll();

		if (list != null) {
			for (Estado estado : list) {
				listaRetorno.add(new EstadoDTO(estado.getIdEstado(), estado.getNomeEstado(), estado.isAtiva(),
						estado.getCdEstado()));
			}
		}

		return listaRetorno;
	}

}
