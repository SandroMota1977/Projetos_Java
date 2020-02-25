//APLICA��O PRODUTO

package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Produtos;

public class App_Produtos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produtos  produtos = new Produtos();
		System.out.println("Digite o produto: ");
		System.out.println();
		System.out.print("Nome: ");
		produtos.nome = sc.nextLine();
		System.out.println();
		System.out.print("Digite o pre�o do produto: ");
		System.out.println();
		System.out.print("Pre�o: ");
		produtos.preco = sc.nextDouble();
		System.out.print("Digite a quantidade do produto: ");
		System.out.println();
		System.out.print("Quantidade: ");
		produtos.quantidade = sc.nextInt();
		
		//System.out.println(produtos.nome + ", " + produtos.preco + ", " + produtos.quantidade);
		System.out.println("Dados do Produto: " + produtos);
		System.out.println();
		System.out.println("Entre com o n�mero de produtos para entrada em estoque: ");
		System.out.println();
		int quantidade = sc.nextInt();
		produtos.adicionaProdutos(quantidade);
		
		System.out.println();
		System.out.println("Estoque atualizado do Produto: " + produtos);
		
		System.out.println();
		System.out.println("Entre com o n�mero de produtos para sa�da em estoque: ");
		quantidade = sc.nextInt();
		produtos.removeProdutos(quantidade);
		System.out.println();
		System.out.println("Estoque atualizado do Produto: " + produtos);
		
		sc.close();
	}

}
