package main;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GestionPartidos  implements IGestionPertidos{

	private List<Partido> partidos = new ArrayList<>();

	public GestionPartidos() {
		try {
			List<String> datosArchivo = Files.readAllLines(Paths.get("euroleague_results.csv"), StandardCharsets.UTF_8);
			for (String string : datosArchivo) {
				partidos.add(new Partido(string));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	Crea una interfaz con los métodos siguientes.
////ganadosCasa. Retorna una mapa (String, Integer) en el que se guardará nombre de equipo y número de victorias en casa a 
////lo largo del tiempo.
////equiposParticipantes. Retorna una colección de tipo String con los nombres de los equipos participantes, 
//sin repeticiones (una sola vez cada uno) y ordenados por nombre de equipo.
////partidosEquipo. Retorna una colección con los partidos en los que ha participado un equipo como local o como visitante. 
//El equipo será pasado como parámetro.
////ganadosDelEquipo. Retorna el número de partidos ganados por un equipo, tanto como local como visitante y a
//lo largo de todos los años.  El equipo será pasado como parámetro.
////aniosJugados. Retorna una colección con los años en los que se han jugado partidos. 
//La colección debe estar ordenada de forma ascendente. 
////promedioPuntosPartidoAnio. Retorna un mapa con los años en los que se han jugado partidos y 
//la media de puntos por partido por año. 
////Para conocer los puntos por partido se sumarán puntos del equipo local más puntos del equipo visitante.
	@Override
	public HashMap<String, Integer> ganadosCasa() {
		// TODO Auto-generated method stub
		HashMap<String, Integer> ganados = new HashMap<>();
		for (Partido partido : partidos) {
			if ((ganados.containsKey(partido.getEquipoLocal()) && (partido.getPuntosLocal() > partido.getPuntosVisitante()))) {
				ganados.put(partido.getEquipoLocal(), ganados.get(partido.getEquipoLocal())+1);
			} else {
				ganados.put(partido.getEquipoLocal(), 1);
			}
		}
		return ganados;
	}

	@Override
	public List<String> equiposParticipantes() {
		// TODO Auto-generated method stub
		Set<String> equipo = new HashSet<>();
		for (Partido partido : partidos) {
			equipo.add(partido.getEquipoLocal());
		}
		List<String> retornar = new ArrayList<>(equipo);
		Collections.sort(retornar);
		return retornar;
	}

	@Override
	public List<Partido> partidosEquipo(String equipo) {
		// TODO Auto-generated method stub
		List<Partido> list = new ArrayList<>();
		for (Partido partido : partidos) {
			if (partido.getEquipoLocal().equals(equipo) || partido.getEquipoVisitante().equals(equipo)) {
				list.add(partido);
			}
		}
		return list;
	}

	@Override
	public int ganadosDelEquipo(String equipo) {
		// TODO Auto-generated method stub
		int ganados = 0;
		for (Partido partido : partidos) {
			if ((partido.getEquipoLocal().equalsIgnoreCase(equipo)) && (partido.getPuntosLocal() > partido.getPuntosVisitante())) {
				ganados++;
			}else if ((partido.getEquipoVisitante().equalsIgnoreCase(equipo)) && (partido.getPuntosLocal() < partido.getPuntosVisitante())) {
				ganados++;
			}
		}
		return ganados;
	}

	@Override
	public List<Integer> aniosJugados() {
		// TODO Auto-generated method stub
		Set<Integer> years = new HashSet<>();
		for (Partido partido : partidos) {
			years.add(partido.getFechaPartido().getYear());
		}
		List<Integer> retornar = new ArrayList<>(years);
		Collections.sort(retornar);
		return retornar;
	}

	@Override
	public HashMap<Integer, Double> PromedioPuntosPartidoAnio() {
		// TODO Auto-generated method stub
		HashMap<Integer, Double> promedio = new HashMap<>();
		HashMap<Integer, Double> yearPartidos = new HashMap<>();
		for (Partido partido : partidos) {
			if (!yearPartidos.containsKey(partido.getFechaPartido().getYear()) && !promedio.containsKey(partido.getFechaPartido().getYear())) {
				//System.out.println("si");
				yearPartidos.put(partido.getFechaPartido().getYear(), 1.0);
				promedio.put(partido.getFechaPartido().getYear(), (double)(partido.getPuntosLocal() + partido.getPuntosVisitante()));
			} else {
				
				yearPartidos.put(partido.getFechaPartido().getYear(), yearPartidos.get(partido.getFechaPartido().getYear())+1);
				double puntos = promedio.get(partido.getFechaPartido().getYear());
				promedio.put(partido.getFechaPartido().getYear(), ((puntos +(partido.getPuntosLocal() + partido.getPuntosVisitante()))));
				
			}
		}
		HashMap<Integer, Double> retornar = new HashMap<>();
		for (Entry<Integer, Double> partido : yearPartidos.entrySet()) {
			//System.out.printf("%d %d\n", partido.getKey(), partido.getValue());
			retornar.put(partido.getKey(), (double) (promedio.get(partido.getKey())  /partido.getValue()));
		
		
		}
		return retornar;
	}
	
}