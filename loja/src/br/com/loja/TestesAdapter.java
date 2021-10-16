package br.com.loja;

import java.math.BigDecimal;

import br.com.loja.http.HttpClient;
import br.com.loja.orcamento.ItemOrcamento;
import br.com.loja.orcamento.Orcamento;
import br.com.loja.orcamento.RegistroOrcamento;

public class TestesAdapter {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("600")));
		orcamento.aprovar();
		orcamento.finalizar();
		
		RegistroOrcamento registro = new RegistroOrcamento(new HttpClient());
		registro.registrar(orcamento);
	}

}
