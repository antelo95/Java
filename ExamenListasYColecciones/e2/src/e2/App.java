package e2;

import java.time.LocalDate;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		GestionPersonas g = new GestionPersonas();
		g.addPersona(new Persona("1", "Pepe", "Sanchez", LocalDate.of(1963, 10, 22)));
		g.addPersona(new Persona("2", "Lola", "Leon", LocalDate.of(1969, 1, 2)));
		g.addPersona(new Persona("3", "Juan", "Mata", LocalDate.of(2004, 11, 12)));
		g.addPersona(new Persona("4", "Agustin", "Silva", LocalDate.of(1980, 3, 8)));
		g.addPersona(new Persona("4", "Agustin", "Silva", LocalDate.of(1980, 3, 8)));
		//g.mostrar();
		Persona [] personas = {
				new Persona("7", "Manolo", "Galvan", LocalDate.of(2003, 3, 2)),
				new Persona("6", "Manolito", "Sanchis", LocalDate.of(2008, 11, 21))
		};
		g.addVariasPersonas(personas);
		//g.mostrar();
//		List<Persona> nacidos = g.nacidosEn(1980);
//		for (Persona persona : nacidos) {
//			System.out.println(persona.toString());
//		}
		
//		List<Persona> nacidos = g.nacidosEntre(LocalDate.of(2001, 3, 2), LocalDate.of(2010, 3, 2));
//		for (Persona persona : nacidos) {
//			System.out.println(persona.toString());
//		}
		 int num = g.eliminarConPatron("San");
		 System.out.println(num);
	}

}
