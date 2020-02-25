package aplication;
import java.util.Locale;
import java.util.Scanner;

import util.Calculator_Static;

public class App_Circulo_Static {
	
	
	public static final double PI = 3.14159;
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio: ");
		double radius = sc.nextDouble();
		
		double c = Calculator_Static.circunferencia(radius);	
		
		double v = Calculator_Static.volume(radius);
		
		System.out.printf("Circunferência: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor do PI: %.2f%n", Calculator_Static.PI);
		
		sc.close();
	}

}

