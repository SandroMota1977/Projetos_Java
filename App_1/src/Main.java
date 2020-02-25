import java.util.Locale;

public class Main {
	
	
		 int y = 32;
		 String nome = "Maria";
		 int idade = 42;
		 double renda = 4000.0;
		 double x = 10.36589;
		 String product1 = "Computador";
		 String product2 = "Office desk";
		 int age = 42;
		 int id_cod = 5290;
		 char gender = 'F';
		 double price1 = 2100.0;
		 double price2 = 650.500;
		 double measure = 53.234567;
		 double a1,b1, B, h;
		 b = 6.0;
		 B = 8.0;
		 h = 5.0;
		 area = (b + B)/2 * h;
		 int f, g;
		 double resultado;
		 
		 f = 5;
		 g = 2;
		 resultado = (double) f / g;
		 System.out.println("Porra!!" + y);
		 System.out.printf("%.2f%n", x);
		 System.out.printf("%.4f%n", x);
		 Locale.setDefault(Locale.US);
		 System.out.printf("%.4f%n", x);
		 System.out.println("Resultado = " + y);
		 System.out.printf("Resultado = %.2f metros%n", x);
		 System.out.printf("%s tem %d anos e ganha R$ %.2f%n", nome, idade, renda);
		 System.out.println("Produtos:");
		 System.out.printf("%s which price is R$ %.3f%n", product1, price1 );
		 System.out.printf("%s which price is R$ %.3f%n", product2, price2 );
		 System.out.printf("Record: %s years old, code %d and gender %b%n", idade, id_cod, gender);
		 System.out.printf("A área é de:  %.2f%n", area);
		 
		 // Quando dividimos dois numeros inteiros e o resultado da divisão pode não ser um inteiro devemos explicitar o resultado da variavel como (double)
		 
		 System.out.println("o Resultado é: " + resultado);
		 
		 
	}

}
