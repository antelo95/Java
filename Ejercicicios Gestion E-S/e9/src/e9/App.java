package e9;

import java.io.IOException;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			GestionProductos g = new GestionProductos();
			//System.out.println(g.buscarPorId("Q1-00002"));
			//g.mostrarProductos();
			g.ventasYearAFichero(2016);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
