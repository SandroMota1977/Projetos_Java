package aplication;

public class ForEach {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"Sandro", "Ot�vio", "Vinni"};
		
		for(int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("_____________________________________________________");
		for(String obj : vect) {
		System.out.println(obj);
		}
	}
}