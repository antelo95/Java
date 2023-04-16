package clases;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class Sorteo {

	private List<Participante> participantes = new ArrayList<>();
	private List<Premio> premios = new ArrayList<>();

	public Sorteo() {

		try {
			List<String> datosArchivo = Files.readAllLines(Paths.get("participantes.csv"), StandardCharsets.UTF_8);

			for (String string : datosArchivo) {
				participantes.add(new Participante(string));
			}

			premios.add(new Premio(1, "Honda Civic e200", 45000));
			premios.add(new Premio(2, "Orbea Orca LTD2 Ultegra DI2", 6800));
			premios.add(new Premio(3, "Fire TV Stick 4K", 69.99));
			premios.add(new Premio(4, "Xiaomi Smart TV 125 cm 4K", 369.99));
			premios.add(new Premio(5, "Google ChromeCast 4K", 57));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * Este código de Java implementa una función llamada "sortear" que sortea los participantes en un sorteo y asigna los premios correspondientes.

El método comienza haciendo una copia de la lista de participantes, llamada "participantes", utilizando el constructor ArrayList<>(participantes). Esto se hace para evitar que la lista original se vea afectada durante el proceso de sorteo.

Luego, el método comprueba si hay suficientes premios disponibles para asignar a todos los participantes. Si es así, se utiliza la clase Random para generar un número aleatorio que se utilizará para seleccionar un participante de la lista "parCopy".

El método luego imprime en la consola la fecha actual y el resultado del sorteo, seguido por un bucle "for" que recorre todos los premios disponibles y asigna un participante aleatorio a cada uno.

Para cada premio, se selecciona un participante aleatorio de "parCopy", se imprime el premio y el nombre del participante correspondiente en la consola, y se elimina el participante de la lista "parCopy" para asegurarse de que no se le asignen más premios.

Si no hay suficientes premios para todos los participantes, el método imprime un mensaje de error.
	 */
	public void sortear() {
		List<Participante> parCopy = new ArrayList<>(participantes);
		if (premios.size() <= participantes.size()) {
			Random rdn = new Random();
			System.out.printf("Fecha: %s. Resultado del sorteo\n", LocalDate.now());
			System.out.println("***********************\n\n");
			for (Premio premio : premios) {
				int numero = rdn.nextInt(parCopy.size());
				Participante p = parCopy.get(numero);
				
				System.out.printf("Premio %d. %s\n", premio.getId(), premio.getDescripcion());
				System.out.printf("Participante: %s %s\n", p.getNombre(), p.getApellido());
				System.out.println("________________________");
				parCopy.remove(numero);
			}
		} else 
			System.out.println("No se puede celebrar el sorteo");
	}
	
	public void mostrar() {
		System.out.println("Participantes\n");
		for (Participante participante : participantes) {
			System.out.println(participante.toString());
		}
		System.out.println("\nPremios\n");
		for (Premio premio : premios) {
			System.out.println(premio.toString());
		}
	}
	
}
