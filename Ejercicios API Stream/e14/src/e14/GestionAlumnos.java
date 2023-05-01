package e14;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class GestionAlumnos {
	private List<Alumno> alumnos = new ArrayList<>();

	public GestionAlumnos() throws IOException {
		super();
		List<String> datos = Files.readAllLines(Paths.get("DatosAlumnos.txt"), StandardCharsets.UTF_8);
		for (String string : datos) {
			alumnos.add(new Alumno(string));
		}
	}
	
	public void mostrar() {
		alumnos.stream()
				.forEach(System.out::println);
	}
	
	public Optional<Alumno> buscarAlumnoId(String id) {
		return alumnos.stream()
				.filter(a -> a.getId().equals(id))
				.findFirst();
	}
	
	public double mediaAlumno(String id) {
		Optional<Alumno> a = this.buscarAlumnoId(id);
		if (a.isPresent()) {
			return a.get().getNotas()
					.stream()
					.filter(n -> n != null)
					.collect(Collectors.averagingDouble(Double::doubleValue));
				
					
		} return -1;
	}
	
	public int aprobadosAlumnos(String id) {
		Optional<Alumno> a = this.buscarAlumnoId(id);
		if (a.isPresent()) {
			return (int)a.get().getNotas()
					.stream()
					.filter(n -> n>=5)
					.count();
		} return -1;
	}
	
	public long suspensosAlumno(String id) {
		Optional<Alumno> a = this.buscarAlumnoId(id);
		if (a.isPresent()) {
			return a.get().getNotas()
				.stream()
				.filter(n -> n<5.0)
				.count();
		}return -1;
				
	}
	
}
