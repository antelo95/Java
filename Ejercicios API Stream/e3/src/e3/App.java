package e3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numeros = Arrays.asList(1,17,20,33,19,32,455,23,100);
		//Mostrar los valores impares de la misma.
//		numeros.stream()
//			.filter(n -> n%2==1).forEach(System.out::println);
		
		//Mostrar los valores que son, al mismo tiempo,  múltiplos de 2 y de 5.
//		numeros.stream()
//				.filter(n -> n%2==0 && n%5==0).forEach(System.out::println);
		
		//Mostrar cada valor de la lista indicando si es primo o no.
//		numeros.stream()
//				.forEach((n) -> {
//					System.out.printf("%d, primo? ", n);
//					boolean primo = true;
//					if (n <=1)
//						primo=false;
//					else {
//						for (int i = 2; i <= n/2; i++) {
//							if (n%i==0) {
//								primo=false;
//								break;
//							}
//						}
//					}
//					System.out.println(primo);
//				});
		
		//Obtener una lista con los valores pares de la lista original.
		List<Integer> pares = numeros.stream()
				.filter(n -> n%2==0)
				.collect(Collectors.toList());
		System.out.println(pares.toString());
		
		
		
	}

}
