package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import clases.GestionPeliculas;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GestionPeliculas g = new GestionPeliculas();
//		List<String> d = g.getNombresSinRepetir();
//		for (String string : d) {
//			System.out.println(string);
//		}
		
		//g.mostrar();
		System.out.println(g.duracionMediaPelis("drama"));
	}

}
