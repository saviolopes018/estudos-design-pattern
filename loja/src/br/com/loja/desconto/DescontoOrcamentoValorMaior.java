package br.com.loja.desconto;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

public class DescontoOrcamentoValorMaior extends Desconto{
	
	public DescontoOrcamentoValorMaior(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal efeturarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05")); 
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
	}
}
