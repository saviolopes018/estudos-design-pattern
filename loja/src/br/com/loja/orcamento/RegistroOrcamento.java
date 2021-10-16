package br.com.loja.orcamento;

import java.util.Map;

import br.com.loja.DomainException;
import br.com.loja.http.HttpAdapter;

public class RegistroOrcamento {
	
	private HttpAdapter http;
	
	public RegistroOrcamento(HttpAdapter http) {
		super();
		this.http = http;
	}

	public void registrar(Orcamento orcamento) {
		if(!orcamento.isFinalizado()) {
			throw new DomainException("Orcamento n�o finalizado!");
		}
		
		String url = "http://api.externa/orcamento";
		Map<String, Object> dados= Map.of(
			"valor", orcamento.getValor(),
			"quantidadeItens", orcamento.getQuantidadeItens()
			
		);
		
		http.post(url, dados);
	}

}
