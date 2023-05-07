package e11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String currentDir = System.getProperty("user.dir");
		Path currentPath = Paths.get(currentDir + "/archivos");
		System.out.printf("Contenido de la carpeta: %s\n\n", currentDir);
		try {
			Stream<Path> contenido = Files.walk(currentPath, 1);
			contenido.filter(Files::isRegularFile)
						.sorted()
						.forEach(a -> {
							try {
								System.out.println(a.toString() + " "
										+ Files.size(a) + " bytes.");
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
