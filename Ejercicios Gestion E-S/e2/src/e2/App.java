package e2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> cerca = Arrays.asList("Hay días que parece que nunca se va a apagar el Sol",
				"y otros son más tristes que una despedida en la estación",
				"Es igual que nuestra vida, que cuando todo va bien, ",
				"un día tuerces una esquina y te tuerces tú también", "Esa telaraña que cuelga en mi habitación,",
				"no la quito, no hace nada, sólo ocupa su rincón.", "Yo he crecido cerca de las vías y por eso sé",
				"que la tristeza y la alegría viajan en el mismo tren",
				"¿Quieres ver el mundo? Mira, está debajo de tus pies");
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("cancion.txt"));
			for (String string : cerca) {
				bw.write(string);
				bw.newLine();
			}
			bw.close();
			System.out.println("Archivito creado!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
