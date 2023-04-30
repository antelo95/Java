package e6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Jugador> jugadores = new ArrayList<>();
		
		for (int i = 1; i <= 10; i++) {
			Random r = new Random();
			char c = (char)(r.nextInt(26) + 'A');
			jugadores.add(new Jugador("0"+i, c+"Jugador"+i, new Random().nextDouble(75, 130), 
					new Random().nextDouble(185, 223)));
		}
		
//		Muestra las alturas en orden creciente.
//		Muestra los datos de los jugadores en orden creciente por nombre
//		Muestra los datos de los jugadores en orden decreciente por peso
//		Muestra los datos del jugador más pesado
//		System.out.println("Alturas orden creciente:");
//		jugadores.stream()
//				.map(Jugador::getAltura)
//				.sorted()
//				.forEach(System.out::println);
//		System.out.println("orden creciente por nombre");
//		jugadores.stream()
//				.sorted((j1, j2) -> j1.getNombre().compareTo(j2.getNombre()))
//				.forEach(System.out::println);
		
		System.out.println(jugadores.stream()
		.sorted((j1, j2) -> {
			Double peso1= j1.getPeso();
			Double peso2 = j2.getPeso();
			return -peso1.compareTo(peso2);
		})
		.findFirst().get());
	}

}