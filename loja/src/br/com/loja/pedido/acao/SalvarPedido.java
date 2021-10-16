package br.com.loja.pedido.acao;

import br.com.loja.pedido.Pedido;

public class SalvarPedido implements AcaoAposGerarPedido{
	
	public void executarAcao(Pedido pedido) {
		System.out.println("Salvando pedido no banco de dados!");
	}

}
