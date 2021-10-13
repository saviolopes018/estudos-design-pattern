package br.com.loja;

import java.math.BigDecimal;

import br.com.loja.desconto.CalculadoraDeDescontos;
import br.com.loja.orcamento.Orcamento;

public class TestesDescontos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("200"), 6L);
		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		System.out.println(calculadora.calcular(orcamento));
	}

}
