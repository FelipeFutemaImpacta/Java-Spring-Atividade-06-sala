package br.com.impacta.lab;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import br.com.impacta.models.*;
import org.junit.Test;

class JavaSpringTemplateApplicationTests {

	@Test
	public void shouldHaveBuscarProdutoAsStaticMethod() {
		
		ArrayList<Produto> listaDeProdutos = new ArrayList<>();
		
		Produto produto = new Produto();
		produto.codigo = 1;
		produto.descricao = "Camisa";
		produto.valor = 70.00;
		
		listaDeProdutos.add(produto);
		
		Produto produtoEncontrado = Produto.buscarProdutoPeloId(listaDeProdutos, 1);
		
		
		assertEquals("Camisa", produtoEncontrado.descricao);
		
	}

	@Test
	public void shouldBuscarProdutoWithNewProdutoCodigo15() {
		
		ArrayList<Produto> listaDeProdutos = new ArrayList<>();
		
		Produto produto = new Produto();
		produto.codigo = 15;
		produto.descricao = "Tenis";
		produto.valor = 200.00;
		
		listaDeProdutos.add(produto);
		
		Produto produtoEncontrado = Produto.buscarProdutoPeloId(listaDeProdutos, 15);
		
		assertEquals("Tenis", produtoEncontrado.descricao);
	}
	
}
