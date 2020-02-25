package aplication;
import java.util.Locale;
import java.util.Scanner;

public class Programa_Circulo {
	
	
	public static final double PI = 3.14159;
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio: ");
		
		double radius = sc.nextDouble();
		
		double c = circunferencia(radius);	
		
		double v = volume(radius);
		
		System.out.printf("Circunferência: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor do PI: %.2f%n", PI);
		
		sc.close();
	}
	
	public static double circunferencia(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
