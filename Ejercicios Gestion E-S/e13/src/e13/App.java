package e13;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {

	public static void main(String[] args) {
		String currentDir = System.getProperty("user.dir");
		Path rutaOrigen = Paths.get(currentDir);
		
		try {
			TratarArchivo.fusionar(rutaOrigen, ".txt", "todo2.txt");
			System.out.println("terminado");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		
	
			
			

		
		
	}

}
