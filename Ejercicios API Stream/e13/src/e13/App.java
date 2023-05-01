package e13;

import java.io.IOException;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			GestionPelicula g = new GestionPelicula();
//			for (Pelicula p : g.getPelis()) {
//				System.out.println(p.toString());
//			}
			//g.ordenarPorId("dsc");
//			System.out.println(g.contarPelisDuranMasDe(128));
//			List<String> lista = g.listaTiposPelis();
//			for (String string : lista) {
//				System.out.println(string);
//			}
//			System.out.println(g.mediaDuracionPorTIpo("drama"));
			g.actoresOrdenAscSinRepeticiones();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
