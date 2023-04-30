package e5;

import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Crea una lista de valores Double a partir del método doubles de la clase Random. Debes crear 10 valores entre 1 y 200. 
//		Luego muestra los valores de la lista 
//		Ordenados de forma ascendente.
//		Ordenados de forma descendente
		List<Double> numeros = new Random().doubles(10, 1, 200).boxed().toList();
		
		System.out.println("Asc");
		numeros.stream()
				.sorted().forEach(System.out::println);
		
		System.out.println("*********\nDesc");
		
		numeros.stream()
				.sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}
