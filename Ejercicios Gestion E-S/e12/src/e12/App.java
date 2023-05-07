package e12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String currentDir = System.getProperty("user.dir");
		Path origenDir = Paths.get(currentDir + "/origen");
		Path destinoDir = Paths.get(currentDir + "/destino");
		try {
			copiar(origenDir, destinoDir);
		} catch (NoDirectoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private static void copiar(Path origen, Path destino) throws NoDirectoryException {
		if (Files.isDirectory(origen) && Files.isDirectory(destino)) {
			System.out.printf("Copiando archivos desde \n%s \nhasta \n%s\n\n", origen, destino);
			AtomicInteger contador = new AtomicInteger();
			try {
				Stream<Path> contenido = Files.walk(origen, 1);
				contenido.filter(Files::isRegularFile)
						.sorted()
						.forEach(a ->{
							Path destinoPath = Paths.get(destino.toAbsolutePath().toString(), a.getFileName().toString());
							System.out.println(destinoPath);
							try {
								Files.copy(a,destinoPath, StandardCopyOption.REPLACE_EXISTING);
								contador.incrementAndGet();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						});
				System.out.printf("\nCopiados %d archivos.\n", contador.get());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		} else {
			throw new NoDirectoryException("Comprueba que origen y destino sean directorios");
		}
	}
}
