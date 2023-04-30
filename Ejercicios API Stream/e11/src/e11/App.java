package e11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> pares = Arrays.asList(2,4,6,8);
		List<Integer> impares = Arrays.asList(1,3,5,7);
		
		int suma = Stream.of(pares, impares).flatMap(p -> p.stream())
								.mapToInt(Integer::intValue).sum();
		System.out.println(suma);
		
	}
}
