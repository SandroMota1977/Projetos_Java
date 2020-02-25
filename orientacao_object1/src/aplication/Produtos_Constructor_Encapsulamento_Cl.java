

//APLICAÇÃO PRODUTO

package aplication;
import java.util.Locale;
import java.util.Scanner;
import entities.Produtos_Constructor_Cl;

public class Produtos_Constructor_Encapsulamento_Cl {

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
		System.out.print("Digite a quantidade do produto: ");
		System.out.println();
		System.out.print("Quantidade: ");
		int quantidade = sc.nextInt();
		Produtos_Constructor_Encapsulamento_Cl produtos_Constructor_Encapsulamento_Cl = new Produtos_Constructor_Encapsulamento_Cl();
		
		//Produtos_Constructor_Encapsulamento_Cl.setNome("Carro");
		
		System.out.println("Dados do Produto: " + produtos_Constructor_Encapsulamento_Cl);
		System.out.println();
		System.out.println("Entre com o número de produtos para entrada em estoque: ");
		System.out.println();
		quantidade = sc.nextInt();
		produtos_Constructor_Encapsulamento_Cl.adicionaProdutos(quantidade);

		System.out.println();
		System.out.println("Estoque atualizado do Produto: " + produtos_Constructor_Cl);

		System.out.println();
		System.out.println("Entre com o número de produtos para saída em estoque: ");
		quantidade = sc.nextInt();
		produtos_Constructor_Encapsulamento_Cl.removeProdutos(quantidade);
		System.out.println();
		System.out.println("Estoque atualizado do Produto: " + produtos_Constructor_Encapsulamento_Cl);

		sc.close();
	}

}
