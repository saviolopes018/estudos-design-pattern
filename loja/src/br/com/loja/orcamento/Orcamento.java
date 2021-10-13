package br.com.loja.orcamento;

import java.math.BigDecimal;

public class Orcamento {

	private BigDecimal valor;
	private Long quantidadeItens;
	
	public Orcamento(BigDecimal valor, Long quantidadeItens) {
		super();
		this.valor = valor;
		this.quantidadeItens = quantidadeItens;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public Long getQuantidadeItens() {
		return quantidadeItens;
	}
	
}
