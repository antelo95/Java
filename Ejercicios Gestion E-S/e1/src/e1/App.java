package e1;

import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fw = new FileWriter("archivito.txt");
			String str = "Más corre el galgo que el mastín";
			
			for (char c : str.toCharArray()) {
				fw.write(c);
			}
			fw.close();
			System.out.println("Archivo creado");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
