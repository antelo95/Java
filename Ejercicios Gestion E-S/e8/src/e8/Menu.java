package e8;

import java.util.Scanner;

public class Menu {
	private String [] opciones;

	public Menu(String[] opciones) {
		super();
		this.opciones = opciones;
	}
	
	public String mostrarMenu() {
		Scanner sc = new Scanner(System.in);
		String opcion = "";
		for (int i = 0; i < opciones.length; i++) {
			System.out.println(opciones[i]);
		}
		opcion = sc.next();
		return opcion;
	}
}
