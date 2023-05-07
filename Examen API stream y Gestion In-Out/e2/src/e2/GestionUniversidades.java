package e2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GestionUniversidades {
	private List<Universidad> unis = new ArrayList<>();

	public GestionUniversidades() throws IOException {
		super();
		String dir = System.getProperty("user.dir");
		Path path =Paths.get(dir+"/files/universidades.csv");
		List<String> lineas = Files.readAllLines(path);
		for (String string : lineas) {
			unis.add(new Universidad(string));
		}
	}
	
	public void ordenarArchivos() throws IOException {
		HashMap<String, List<String>> paisesUnis = new HashMap<>();
		for (Universidad universidad : unis) {
			if (!paisesUnis.containsKey(universidad.getPais())) {
				List<String> list = new ArrayList<>();
				list.add(universidad.getUni());
				paisesUnis.put(universidad.getPais(), list);
			}else {
				List<String> list = paisesUnis.get(universidad.getPais());
				list.add(universidad.getUni());
				paisesUnis.put(universidad.getPais(), list);
			}
		}
		crearArchivos(paisesUnis);
 	}

	public void crearArchivos(HashMap<String, List<String>> paiseUnis) throws IOException {
		for(String universidad : paiseUnis.keySet()) {
			BufferedWriter escritor = new BufferedWriter(new FileWriter(universidad+ ".txt"));
			System.out.printf("Creando archivo %s.txt\n", universidad);
			List<String> nombre = paiseUnis.get(universidad);
			for (String string : nombre) {
				escritor.write(string);
				escritor.newLine();
			}
			escritor.close();
		}
	}
	
	//	public void crearArchivos() {
//		
//		for (Universidad universidad : unis) {
//			BufferedWriter escritor = new BufferedWriter(new FileWriter(null));
//		}
////		BufferedWriter fSalida = new BufferedWriter(new FileWriter(nombreArchivo));
//		pelis.stream().filter(p -> {
//			return p.getGeneros().stream().anyMatch(element -> genBuscados.contains(element));
//		}).forEach(p -> {
//			try {
//				fSalida.write(p.toString());
//				fSalida.newLine();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//		});// forEach(System.out::println);;
//		fSalida.close();

//	}
	
	
}
