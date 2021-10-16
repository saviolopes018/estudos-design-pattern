package br.com.loja;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.loja.pedido.GeraPedido;
import br.com.loja.pedido.GeraPedidoHandler;
import br.com.loja.pedido.acao.EnviarEmailPedido;
import br.com.loja.pedido.acao.SalvarPedido;

public class TestesPedidos {

	public static void main(String[] args) {
		String cliente = "Maria";
		BigDecimal valorOrcamento = new BigDecimal(300);
		Long quantidadeItens = 2L;
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(new SalvarPedido(), new EnviarEmailPedido()));
		handler.execute(gerador);
	}

}
