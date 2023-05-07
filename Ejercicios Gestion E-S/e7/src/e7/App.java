package e7;

import java.io.IOException;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			GestionAlumnos g = new GestionAlumnos();
			//g.mostrar();
			System.out.println(g.mejorNotaAlumno("2647631"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
