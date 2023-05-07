package e14;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String currentDir = System.getProperty("user.dir");
		Path origen = Paths.get(currentDir + "/archivosE14");
		try {
			Buscar.buscarEnArchivos(origen, "SARA");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
