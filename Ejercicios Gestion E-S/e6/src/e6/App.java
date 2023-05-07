package e6;

import java.io.IOException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Buscando la palabra: ");
		String palabra = sc.next();
		System.out.println("***********************");
		
		
		try {
			TratarArchivo tratarArchivo = new TratarArchivo();
			tratarArchivo.buscarPalabra(palabra);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
