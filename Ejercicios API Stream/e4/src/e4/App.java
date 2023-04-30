package e4;

import java.util.List;
import java.util.Random;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double> numeros = new Random().doubles(10,1,200).boxed().toList();
		
//		Muestra sólo la parte entera de cada Double (método intValue() de la clase Double).
//		Muestra la parte decimal de cada Double.
//		Elimina los menores que 100 y  cuenta los elementos restantes.
		
//		numeros.stream().map(Double::intValue).forEach(System.out::println);;
		
//		numeros.stream()
//				.map(n -> n - n.intValue())
//				.map(n -> n.toString().substring(2))
//				.forEach(System.out::println);
		
		
		System.out.print("Mayores que 100: ");
		long cuenta = numeros.stream()
			.filter(n -> n>=100)
			.count();
		System.out.println(cuenta);
		
	}

}
