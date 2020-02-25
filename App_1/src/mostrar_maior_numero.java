import java.util.Scanner;

public class mostrar_maior_numero {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in); 
		
		System.out.println("Entre com 3 números: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int maior = max(n1, n2, n3);
		showResult(maior);
		
		sc.close();
	}
	
	public static int max(int x, int y, int z) {
		int aux;
		if(x > y && x > z) {
			aux = x;
			
		}else if(y > z){
			aux = y;
		}else {
			aux = z;
			}
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("O maior número é: " + value);
		
	}
}
