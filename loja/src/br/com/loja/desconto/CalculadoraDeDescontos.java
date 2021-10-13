package br.com.loja.desconto;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {
	
	public BigDecimal calcular(Orcamento orcamento) {
		Desconto desconto = new DescontoOrcamentoCincoItens(
				new DescontoOrcamentoValorMaior(
						new SemDesconto()));
		
		return desconto.calcular(orcamento);
	}

}
