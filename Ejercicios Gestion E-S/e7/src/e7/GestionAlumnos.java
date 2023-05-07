package e7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;

public class GestionAlumnos {
	private HashMap<String, Alumno> alumnos = new HashMap<>();

	public GestionAlumnos() throws IOException {
		super();
		
		List<String> datos = Files.readAllLines(Paths.get("DatosAlumnos.txt"));
		for (String string : datos) {
			Alumno a = new Alumno(string);
			alumnos.put(a.getId(), a);
		}
	}
	
//	public List<Double> getNotasPorId(String id) {
//		return alumnos.stream()
//				.filter(a -> a.getId().equals(id))
//				.map(Alumno::getNotas)
//				.flatMap(p -> p.stream())
//				.toList();
//	}
	
	public List<Double> getNotasPorId(String id) {
		Alumno a = alumnos.get(id);
		return (a == null)? null : a.getNotas();
	}
	
	public double mediaAlumno(String id) {
		Alumno a = alumnos.get(id);
		return (a == null)? -1: a.getMediaNotas();
	}
	
	public double mejorNotaAlumno(String id) {
		Alumno a = alumnos.get(id);
		return (a == null)? -1: a.getMejorNota();
	}
	
	public void mostrar() {
		for (Alumno a : alumnos.values()) {
			System.out.printf("Id: %s Nombre: %s Media: %.2f\n", a.getId(), a.getNombre(),
					a.getMediaNotas());
		}
	}
	
}
