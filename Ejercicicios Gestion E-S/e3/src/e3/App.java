package e3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("nuevoArchivito.txt"));
			while (true) {
				System.out.println("Escribe una palabra: ");
				String palabra = sc.next();
				if (palabra.equalsIgnoreCase("fin")) {
					System.out.println("Saliendo...");
					break;
				}
				bw.write(palabra);
				bw.newLine();
			}
			bw.close();
			System.out.println("Archivo creado");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
