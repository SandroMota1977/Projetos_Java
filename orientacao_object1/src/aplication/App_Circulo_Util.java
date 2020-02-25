package aplication;
import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class App_Circulo_Util {
	
	
	public static final double PI = 3.14159;
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculator calculo = new Calculator();
		
		System.out.println("Digite o raio: ");
		double radius = sc.nextDouble();
		
		double c = calculo.circunferencia(radius);	
		
		double v = calculo.volume(radius);
		
		System.out.printf("Circunferência: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor do PI: %.2f%n", calculo.PI);
		
		sc.close();
	}

}
