package e10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path path = Paths.get("", "archivos");
		System.out.println("Contenido de la carpeta: " + path.toAbsolutePath());
		
		try {
			Stream<Path> contenido = Files.walk(path);
			contenido.filter(e ->
					!e.toAbsolutePath().equals(path.toAbsolutePath()))
					.sorted()
					.forEach(e -> {
						if (Files.isDirectory(e)) {
							System.out.println("Directorio: "+e.toString());
						}else {
							System.out.println("Archivo: "+e.toString());
						}
					});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
