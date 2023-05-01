package e14;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

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
	
	
}
