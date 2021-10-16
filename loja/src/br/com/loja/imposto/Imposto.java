package br.com.loja.imposto;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

public abstract class Imposto {
	
	private Imposto imposto;
	
	public Imposto(Imposto imposto) {
		this.imposto = imposto;
	}
	
	protected abstract BigDecimal realizarCalculo(Orcamento orcamento);
	
	public BigDecimal calcular(Orcamento orcamento) {
		BigDecimal valorImpostoPrimario = realizarCalculo(orcamento);
		BigDecimal valorImpostoSecundario = BigDecimal.ZERO;
		if(imposto != null) {
			valorImpostoSecundario = imposto.realizarCalculo(orcamento);
		}
		return valorImpostoPrimario.add(valorImpostoSecundario);
	}

}
