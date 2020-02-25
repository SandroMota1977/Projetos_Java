package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.ProdutoVetor;

public class VetoresClass {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ProdutoVetor[] vect = new ProdutoVetor[n];
		
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vect[i] = new ProdutoVetor(nome, preco);
		}
		
		double sum = 0.0;
		for(int i=0; i<vect.length;i++) {
			sum += vect [i].getPreco();
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("Média de preço é: %.2f%n", avg);
		
		sc.close();
	}

}
