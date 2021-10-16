package br.com.loja;

import java.math.BigDecimal;

import br.com.loja.desconto.CalculadoraDeDescontos;
import br.com.loja.orcamento.ItemOrcamento;
import br.com.loja.orcamento.Orcamento;

public class TestesDescontos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		System.out.println(calculadora.calcular(orcamento));
	}

}
