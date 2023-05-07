package e4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TratarArchivo {
	
	public static void tratar(String archivo) throws IOException {
		BufferedReader leer = new BufferedReader(new FileReader(archivo));
		String linea = "";
		List<String> contenido = new ArrayList<>();
		while ((linea=leer.readLine())!= null) {
			contenido.add(linea);
		}
		leer.close();
		
		Collections.sort(contenido);
		
		BufferedWriter escribir = new BufferedWriter(new FileWriter(archivo));
		for (String string : contenido) {
			escribir.write(string);
			escribir.newLine();
		}
		escribir.close();
	}
}
