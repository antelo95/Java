package e7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GestionJugadores {

	private List<Jugador> jugadores = new ArrayList<>();

	public GestionJugadores() {
		for (int i = 1; i <= 10; i++) {
			Random r = new Random();
			char c = (char) (r.nextInt(26) + 'A');
			jugadores.add(new Jugador("0" + i, c + "Jugador" + i, new Random().nextDouble(75, 130),
					new Random().nextDouble(185, 223)));
		}
	}

	public List<Jugador> getJugadores() {
		return jugadores;
	}
	
	public void nombresJugadoresOrdenASC() {
		jugadores.stream()
				.map(Jugador::getNombre)
				.sorted()
				.forEach(System.out::println);
	}
	
	public void jugadoresNombreContieneLetra(char c) {
		jugadores.stream()
			.filter(j -> j.getNombre().toLowerCase()
					.contains(Character.toString(c)))
			.forEach(System.out::println);
	}
	
	public void mediaPesos() {
		Double media= jugadores.stream()
				.map(Jugador::getPeso)
				.collect(Collectors.averagingDouble(Double::doubleValue));
		System.out.printf("%.2f\n",media);
	}
	
	public void alturaSuperiorMedia() {
		Double media = jugadores.stream()
								.map(Jugador::getAltura)
								.collect(Collectors.averagingDouble(Double::doubleValue));
		System.out.println("Media: "+media);
		jugadores.stream()
				.filter(j -> j.getAltura() > media)
				.forEach(System.out::println);
	}

}
