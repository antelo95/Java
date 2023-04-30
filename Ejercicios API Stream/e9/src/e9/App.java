package e9;

import java.util.Arrays;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [][] m = {{2,2,2,4},{4,5,1}};
		
//		La lista de sus elementos sin repeticiones.

//		Arrays.stream(m).flatMap(fila -> Arrays.stream(fila))
//					.distinct()
//					.forEach(System.out::println);;
		
		//		La suma de sus elementos.
		
		int suma = Arrays.stream(m)
				.flatMap(fila -> Arrays.stream(fila))
				.collect(Collectors.summingInt(valor -> valor));
		System.out.println(suma);
	}

}
