package e2;

import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numeros = Arrays.asList(10,20,4,100);
		//Mostrar solo los pares.
//		numeros.stream()
//			.filter((n) -> n%2 == 0).forEach(System.out::println);;
		
		//Mostrar si todos son positivos.
//		System.out.println((numeros.stream()
//			.allMatch((n) -> n>=0)));
		
		//Obtener el menor.
//		System.out.println(numeros.stream()
//				.sorted().findFirst().get());
		
		//Obtener la suma de todos los valores.
		System.out.println(numeros.stream()
					.mapToInt(n -> n.intValue()).sum());
		
	}

}
