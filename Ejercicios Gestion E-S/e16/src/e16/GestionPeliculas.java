package e16;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class GestionPeliculas {
	private List<Pelicula> pelis = new ArrayList<>();
	
	
	public GestionPeliculas(Path path) throws IOException {
		List<String> lineas = Files.readAllLines(path);
		for (String string : lineas) {
			pelis.add(new Pelicula(string));
		}
	}
	
	public void mostrar() {
		for (Pelicula pelicula : pelis) {
			System.out.println(pelicula.toString());
		}
	}
	
	public void pelisABinario(String binario) throws FileNotFoundException, IOException {
		ObjectOutputStream oSalida = new ObjectOutputStream(new FileOutputStream(binario));
		oSalida.writeObject(pelis);
		oSalida.close();
		System.out.println("Procesado con exito!!");
	}
	
	public void pelisYearABinario(String binario, int year) throws FileNotFoundException, IOException {
		ObjectOutputStream oSalida = new ObjectOutputStream(new FileOutputStream(binario));
		List<Pelicula> pelisYear = pelis.stream()
										.filter(p -> p.getFecha().getYear() == year).toList();

		oSalida.writeObject(pelisYear);
		oSalida.close();
		System.out.println("Procesado con exito!!");
	}
public void pelisGenreToTextFile(String nombreArchivo, String...gens) throws IOException {
		
		List<String> genBuscados = Arrays.asList(gens);
		
		BufferedWriter fSalida = new BufferedWriter(new FileWriter(nombreArchivo));
		pelis
			.stream()
			.filter(p -> {
				return p.getGeneros()
						.stream().anyMatch(element -> genBuscados.contains(element));
			}).forEach(p -> {
				try {
					fSalida.write(p.toString());
					fSalida.newLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			});//forEach(System.out::println);;
		fSalida.close();
	}
	
	
	public void eNePelisMasPuntuacion(int n) {
		AtomicInteger position= new AtomicInteger(1);
		pelis
			.stream()
			.sorted(Comparator.comparing(Pelicula::getPuntuacion).reversed())
			.limit(n)
			.forEach(p -> {
				System.out.printf("%d. \t %-50s  %f\n", position.get(), p.getTitulo(), p.getPuntuacion());
				position.incrementAndGet();
			});
	}	
}
