package e6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TratarArchivo {
	private List<String> lineas = new ArrayList<>();

	public TratarArchivo() throws IOException {
		lineas = Files.readAllLines(Paths.get("texto.txt"));
	}
	
	public void buscarPalabra(String palabra) {
		int linea = 1;
		for (String string : lineas) {
			if (string.contains(palabra)) {
				System.out.printf("Encontrada en línea %d: %s\n", linea, string);
			}
			linea++;
		}
	}
	
	
}
