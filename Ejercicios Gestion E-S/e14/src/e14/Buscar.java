package e14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Buscar {
	
	public static void buscarEnArchivos(Path ruta, String textoBuscado) throws IOException {
		Stream<Path> paths = Files.walk(ruta, 1);
		paths.filter((Path p) -> Files.isRegularFile(p))
				.forEach((Path p) -> {
					try {
						buscarEnArchivo(p, textoBuscado);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}) ;
	}

	private static void buscarEnArchivo(Path p, String textoBuscado) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader lector = new BufferedReader(new FileReader(p.toAbsolutePath().toString()));
		String linea = "";
		int num = 1;
		System.out.printf("Buscando %s en %s \n", textoBuscado, p.getFileName());
		System.out.println("*********************");
		while ((linea = lector.readLine()) != null) {
			if (linea.contains(textoBuscado)) {
				System.out.printf("Encontrado en línea %d: %s\n", num, linea);
			}
			num++;
		}
	}
}
