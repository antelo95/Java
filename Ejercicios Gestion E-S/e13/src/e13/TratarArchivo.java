package e13;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class TratarArchivo {
	public static void fusionar(Path origen, String extension, String ficheroDestino) throws IOException {
		BufferedWriter paises = new BufferedWriter(new FileWriter(ficheroDestino));
		Stream<Path> paths = Files.walk(origen, 1);
		 
			paths
				.filter(e->(Files.isRegularFile(e) && e.getFileName().toString().endsWith(extension)))
				.map(ruta -> {
					try {
						return Files.readAllLines(ruta);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						return null;
					}
					
				})
				.flatMap( lista -> lista.stream())
				.forEach( elemento -> {
					try {
						paises.write(elemento);
						paises.newLine();
					} catch (IOException e) {
						System.out.println(e.getMessage());
					}}
				);
		
	}
}
