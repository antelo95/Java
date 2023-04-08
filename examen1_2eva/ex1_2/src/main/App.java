package main;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		GestionAeropuertos g = new GestionAeropuertos();
		
		//g.mostrar();
//		String[] aero = g.aeroPais("US");
//		for (String string : aero) {
//			System.out.println(string);
//		}
		//g.mostrarAeroPaises("AU", "BR");
		g.contarPorContinente();
	}

}
