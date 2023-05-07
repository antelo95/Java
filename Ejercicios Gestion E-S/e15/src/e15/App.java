package e15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dir = System.getProperty("user.dir");
		Path rutaOrigen = Paths.get(dir + "/archivoNumeros.txt");
		
		try {
			List<String> numeros = Files.readAllLines(rutaOrigen);
			int suma = numeros.stream()
							.map((String n) -> {
								return Integer.parseInt(n);
							}).collect(Collectors.summingInt(Integer::intValue));
			int resto = suma % 23;
			
			BufferedReader lector = new BufferedReader(new FileReader("codificado.txt"));
			String linea = lector.readLine();
			String mensaje = "";
			for (int i = 0; i < linea.length(); i++) {
				char c = linea.charAt(i);
				int ascii = (int) c - resto;
				mensaje += (char) ascii; 
			}
			System.out.println(mensaje);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
