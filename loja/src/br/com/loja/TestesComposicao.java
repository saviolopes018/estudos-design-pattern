package br.com.loja;

import java.math.BigDecimal;

import br.com.loja.orcamento.ItemOrcamento;
import br.com.loja.orcamento.Orcamento;

public class TestesComposicao {

	public static void main(String[] args) {
		Orcamento orcamentoAntigo = new Orcamento();
		orcamentoAntigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
		orcamentoAntigo.reprovar();
		
		Orcamento orcamentoNovo = new Orcamento();
		orcamentoNovo.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
		orcamentoNovo.adicionarItem(orcamentoAntigo);
		
		System.out.println(orcamentoNovo.getValor());

	}

}
