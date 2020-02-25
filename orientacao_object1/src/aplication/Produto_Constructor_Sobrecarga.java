//APLICAÇÃO PRODUTO

package aplication;
import entities.Produtos_Constructor_Sobrecarga;
import java.util.Locale;
import java.util.Scanner;


public class Produto_Constructor_Sobrecarga {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o produto: ");
		System.out.println();
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.println();
		System.out.print("Digite o preço do produto: ");
		System.out.println();
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		Produtos_Constructor_Sobrecarga produtos_Constructor_Sobrecarga = new Produtos_Constructor_Sobrecarga(nome, preco);
		
		
		System.out.println("Dados do Produto: " + produtos_Constructor_Sobrecarga);
		System.out.println();
		System.out.println("Entre com o número de produtos para entrada em estoque: ");
		System.out.println();
		int quantidade = sc.nextInt();
		produtos_Constructor_Sobrecarga.adicionaProdutos(quantidade);

		System.out.println();
		System.out.println("Estoque atualizado do Produto: " + produtos_Constructor_Sobrecarga);

		System.out.println();
		System.out.println("Entre com o número de produtos para saída em estoque: ");
		quantidade = sc.nextInt();
		produtos_Constructor_Sobrecarga.removeProdutos(quantidade);
		System.out.println();
		System.out.println("Estoque atualizado do Produto: " + produtos_Constructor_Sobrecarga);

		sc.close();
	}

}
