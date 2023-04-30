package e10;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Pais> paises = new ArrayList<>();
		
		Pais espana = new Pais("España");
		espana.addIdioma("Español");espana.addIdioma("Catalán");
		espana.addIdioma("Gallego");
		
		Pais irlanda = new Pais("Irlanda");
		irlanda.addIdioma("Inglés");irlanda.addIdioma("Irlandés");
		
		Pais escocia = new Pais("Escocia");
		escocia.addIdioma("Inglés");escocia.addIdioma("Gaélico-Escocés");
		
		paises.add(espana);
		paises.add(irlanda);
		paises.add(escocia);
		
//		mostrar la lista de los idiomas que se hablan en todos los países ordenados 
//		alfabéticamente (sin repeticiones).
		
		paises.stream()
				.flatMap(p -> p.getIdiomas().stream())
				.distinct()
				.sorted()
				.forEach(System.out::println);
		
//		contar los idiomas distintos que se hablan entre todos los países.
		
		System.out.println(("Nº paises: "+paises.stream()
				.flatMap(p -> p.getIdiomas().stream())
				.distinct()
				.count()));
	}

}
