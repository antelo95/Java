package e1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class CopiarArchivos {
	
	public static int copiar(Path origen, Path destino, String extension) throws IOException {
		if (!Files.exists(destino)) {
			Files.createDirectories(destino);
			System.out.println("Se ha creado una carpeta destino.\n");
		}
		AtomicInteger contador = new AtomicInteger();
		if (Files.exists(origen)) {
			System.out.printf("Copiando archivos %s \ndesde %s \nhacia %s\n\n", extension, origen, destino);
			Stream<Path> contenido;
			

			try {

				contenido = Files.walk(origen, 1);
				contenido.filter(e -> (Files.isRegularFile(e) && e.getFileName().toString().endsWith(extension)))
						.sorted().forEach(a -> {
							try {

								Path destinoPath = Paths.get(destino.toAbsolutePath().toString(),
										a.getFileName().toString());
								System.out.printf("Copiando... %s%s\n", destino, a);
								Files.copy(a, destinoPath, StandardCopyOption.REPLACE_EXISTING);
								contador.incrementAndGet();

							} catch (IOException e) {
								// TODO Auto-generated catch block
								System.out.println(e.getMessage());
							}
						});
				} catch (IOException e){
					System.out.println(e.getMessage());
				}
			return contador.get();
		} return -1;
	}

}
