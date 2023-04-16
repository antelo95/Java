package clases;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class GestionPeliculas {

	private List<Pelicula> pelis = new ArrayList<>();

	public GestionPeliculas() {
	
		try {
			List<String> datosArchivo = Files.readAllLines(Paths.get("film.csv"), 
					StandardCharsets.UTF_8);
			for (String string : datosArchivo) {
				pelis.add(new Pelicula(string));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void mostrar() {
		for (Pelicula pelicula : pelis) {
			System.out.println(pelicula.toString());
		}
	}
	
	public List<String> pelisSinProtaFemenina(){
		List<String> list = new ArrayList<>();
		for (Pelicula peli : pelis) {
			if (peli.getActriz().equals("")) {
				list.add(peli.getTitulo());
			}
		}return list;
	}
	
	public HashMap<String, Integer> cuentaPorTipo(){
		HashMap<String, Integer> tipo = new HashMap<>();
		
		for (Pelicula pelicula : pelis) {
			if (!tipo.containsKey(pelicula.getTipo())) {
				tipo.put(pelicula.getTipo(), 1);
			} else {
				tipo.put(pelicula.getTipo(), tipo.get(pelicula.getTipo())+1);
			}
		}
		return tipo;
	}
	
	public List<String> getNombresSinRepetir() {
		Set<String> directores = new HashSet<>();
		for (Pelicula peli : pelis) {
			if (!directores.contains(peli.getDirector())) {
				directores.add(peli.getDirector());
			}
		}
		List<String> list = new ArrayList<String>(directores);
        Collections.sort(list);
        return list;
		
	}
	
	public Optional<Double> duracionMediaPelis(String tipo) {
		double tiempo = 0;
		int c = 0;
		for (Pelicula pelicula : pelis) {
			if (pelicula.getTipo().equalsIgnoreCase(tipo)) {
				tiempo += pelicula.getDuracion();
				c++;
			}
		}
		return (Optional<Double>) ((c==0)?  Optional.empty() : Optional.of(tiempo/c));
	}
	
	
	

}
