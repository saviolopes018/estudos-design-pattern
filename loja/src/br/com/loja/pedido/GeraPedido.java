package br.com.loja.pedido;

import java.math.BigDecimal;

public class GeraPedido {

	private String cliente;
	private BigDecimal valorOrcamento;
	private Long quantidadeItens;
	
	public GeraPedido(String cliente, BigDecimal valorOrcamento, Long quantidadeItens) {
		this.cliente = cliente;
		this.valorOrcamento = valorOrcamento;
		this.quantidadeItens = quantidadeItens;
	}

	public String getCliente() {
		return cliente;
	}

	public BigDecimal getValorOrcamento() {
		return valorOrcamento;
	}

	public Long getQuantidadeItens() {
		return quantidadeItens;
	}
	
	
}
