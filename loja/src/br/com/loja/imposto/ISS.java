package br.com.loja.imposto;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

public class ISS extends Imposto{
	
	public ISS(Imposto imposto) {
		super(imposto);
	}

	public BigDecimal realizarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.06"));
	}
	
}
