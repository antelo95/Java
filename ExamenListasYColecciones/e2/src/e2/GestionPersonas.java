package e2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class GestionPersonas {
//	Esta gestión implica diseñar los métodos siguientes:
//		añadir una persona a la colección.
//		añadir varias personas. Las personas serán pasadas en un array.
//		retornar las personas que nacieron en un año concreto. El año deberá ser pasado como parámetro. 
//		retornar las personas que nacieron entre dos fechas pasadas como parámetros. Los datos retornados deben estar  ordenados de forma ascendente por fecha.
//		eliminar las personas cuyos apellidos contengan un patrón pasado como parámetro. Retornar el número de personas que se han eliminado.
	private List<Persona> personas = new ArrayList<>();
	
	public void mostrar() {
		for (Persona persona : personas) {
			System.out.println(persona.toString());
		}
	}
	
	public void addPersona(Persona p) {
		if (!personas.contains(p)) {
			personas.add(p);
			System.out.println("Se ha añadido a la persona correctamente");
		}
		
	}
	
	public void addVariasPersonas(Persona [] arr) {
		for (Persona persona : arr) {
			personas.add(persona);
		} 
		System.out.println("Todas las personas se añadieron correctamente");
	}
	
	public List<Persona> nacidosEn(int year) {
		List<Persona> nacidos = new ArrayList<>();
		for (Persona persona : personas) {
			if (persona.getFechaNacimiento().getYear() == year) {
				nacidos.add(persona);
			}
		} return nacidos;
	}
	
	public List<Persona> nacidosEntre(LocalDate inicio, LocalDate fin) {
		List<Persona> nacidos = new ArrayList<>();
		for (Persona persona : personas) {
			if (persona.getFechaNacimiento().isBefore(fin) && persona.getFechaNacimiento().isAfter(inicio)) {
				
				nacidos.add(persona);
			}
		} 
		Collections.sort(nacidos, new Comparator<Persona>() {

			@Override
			public int compare(Persona arg0, Persona arg1) {
				// TODO Auto-generated method stub
				return arg0.getFechaNacimiento().compareTo(arg1.getFechaNacimiento());
			}
			
		});
		return nacidos;
	}
	public int eliminarConPatron(String patron) {
		Iterator<Persona> it = personas.iterator();
		
		int contador = 0;
		while (it.hasNext()) {
			Persona persona = (Persona) it.next();
			if (persona.getApellidos().contains(patron)) {
				it.remove();
				contador++;
			}
		}
		
		return contador;
	}
}
