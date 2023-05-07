package e16;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dir = System.getProperty("user.dir");
		Path path = Paths.get(dir + "/mymoviedb.tsv");
		try {
			GestionPeliculas g = new GestionPeliculas(path);
			//g.mostrar();
			//g.pelisABinario("pelis.dat");
			g.pelisYearABinario("pelisYear.dat", 1992);
			g.pelisGenreToTextFile("PelisActionCrime.txt", "Action", "Crime");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
