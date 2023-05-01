package e13;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class GestionPelicula {
	
	private List<Pelicula> pelis = new ArrayList<>();

	public GestionPelicula() throws IOException {
		super();
		List<String> datos = Files.readAllLines(Paths.get("film.csv"), StandardCharsets.UTF_8);
		int id = 1;
		for (String string : datos) {
			pelis.add(new Pelicula(id, string));
			id++;
		}
	}
	
	public List<Pelicula> getPelis() {
		return pelis;
	}

	public Optional<Pelicula> buscarPeliPorId(int id) {
		return pelis.stream().filter(p -> p.getId() == id).findFirst();
	}
	
	public void ordenarPorId(String orden) {
		pelis.stream()
			.sorted((p1, p2) -> {
				Integer id1 = p1.getId();
				Integer id2 = p2.getId();
				if (orden.equalsIgnoreCase("desc")) {
					return -id1.compareTo(id2);
				} else {
					return id1.compareTo(id2);
				}
			}).forEach(System.out::println);;
	}
	
	public int contarPelisDuranMasDe(int minutos) {
		return (int)pelis.stream()
				.filter(p -> p.getDuracion() > minutos)
				.count();
	}
	
	public List<String> listaTiposPelis() {
		
		 return pelis.stream()
				.map(Pelicula::getTipo)
				.distinct()
				.sorted()
				.toList();
	}
	
	public Pelicula peliMasDuracion() {
		return pelis.stream()
				.sorted((p1, p2) -> {
					Integer d1 = p1.getDuracion();
					Integer d2 = p2.getDuracion();
					return -d1.compareTo(d2);
				}).findFirst()
				.get();
	}
	
	public double mediaDuracionPorTIpo(String tipo) {
		return pelis.stream()
				.filter(p -> p.getTipo().equalsIgnoreCase(tipo))
				.collect(Collectors.averagingDouble(p -> p.getDuracion()));
	}
	
	public void actoresOrdenAscSinRepeticiones() {
		pelis.stream()
				.map(Pelicula::getActores)
				.flatMap(a -> a.stream())
				.distinct()
				.sorted()
				.forEach(System.out::println);
	}
	public List<String> actoresOrdenados(){
		return  pelis.stream()
			.map(Pelicula::getActores)
			.flatMap(lista-> lista.stream())
			.sorted()
			.toList();
	}
}
