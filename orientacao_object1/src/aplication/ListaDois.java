package aplication;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class ListaDois {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Otávio");
		list.add("Vinni");
		list.add("Ivaní");
		list.add("Jr.");
		list.add("Sandro");
		list.add("Sara");
		list.add("Eugênio");
		list.add(5,"Kaio");
		
		System.out.println(list.size());
		
		
		for(String x : list) {
			System.out.println(x);
		}
		
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("______________________________________________");
		//list.removeIf(x -> x.charAt(0) == 'S');
		List<String> resultado = list.stream().filter(x -> x.charAt(0) == 'S').collect(Collectors.toList());
		for (String x : resultado) {
			System.out.println(x);	
		}
		System.out.println("______________________________________________");
		System.out.println("Index do Vinni é: " + list.indexOf("Vinni"));	
		System.out.println("______________________________________________");
		String nome = list.stream().filter(x -> x.charAt(0) == 'S').findFirst().orElse(null);
		System.out.println(nome);
		
		}
		
}

