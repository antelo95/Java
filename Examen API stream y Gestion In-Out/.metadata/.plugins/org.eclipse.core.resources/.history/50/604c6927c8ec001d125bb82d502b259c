package e1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		//otra forma de obtener la carpeta de la app
		String currentDir = System.getProperty("user.dir");
		
		Path origen = Paths.get(currentDir + "/archivos");
		Path destino = Paths.get(currentDir + "/destino");
		
		try {
			int num = CopiarArchivos.copiar(origen, destino, ".dat");
			if (num == -1 ) {
				System.out.println("La carpeta origen no existe.");
			}
			System.out.printf("Se han copiado %d archivos.\n", num);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
			
	}
	
}
