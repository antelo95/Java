package main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		GestionPartidos g = new GestionPartidos();
//		HashMap<String, Integer> ganados = g.ganadosCasa();
//		for (Map.Entry<String, Integer> entry : ganados.entrySet()) {
//			System.out.printf("%s: %d\n", entry.getKey(), entry.getValue());
//		}
		
//		List<String> equipos = g.equiposParticipantes();
//		for (String string : equipos) {
//			System.out.println(string);
//		}
		
//		List<Partido> partidos = g.partidosEquipo("Aris");
//		for (Partido partido : partidos) {
//			System.out.println(partido.toString());
//		}
//		int ganados = g.ganadosDelEquipo("Aris");
//		System.out.println(ganados);
//		List<Integer> years = g.aniosJugados();
//		for (Integer integer : years) {
//			System.out.println(integer);
//		}
		 HashMap<Integer, Double> promedio= g.PromedioPuntosPartidoAnio();
//		HashMap<Integer, Integer> promedio = g.PromedioPuntosPartidoAnio();
		for (Map.Entry<Integer, Double> entry : promedio.entrySet()) {
			System.out.printf("Año %d: Promedio %.2f\n",entry.getKey(), entry.getValue());
		}
	}

}
