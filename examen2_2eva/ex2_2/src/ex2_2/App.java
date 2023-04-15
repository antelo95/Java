package ex2_2;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Publicacion [] coleccion = {
				new Revistas("1", "Computer", "Freak", 102, "INFORMATICA", "SEMANAL"),
				new LibrosTexto("2", "Aprende informátia", "McFreak", 233, "ESO", "ESO_1"),
				new LibrosLectura("3", "De la cochera al rascacielo", "Primera línea", 333, 2020, "BIOGRAFIA"),
				new Revistas("4", "Todo video", "Freak", 102, "VIDEO", "MENSUAL"),
				new LibrosTexto("5", "Aprende informátia", "McFreak", 233, "BACHILLERATO", "BACHILLERATO"),
				new LibrosLectura("6", "De la cochera al rascacielo 2ª Ed", "Primera línea", 333, 2021, "BIOGRAFIA")
		};
		
//		for (Publicacion publicacion : coleccion) {
//			if (publicacion instanceof Revistas) {
//				System.out.printf("[Revista] --> Titulo: %s Periodicidad: %s\n", publicacion.getTitulo(), 
//						((Revistas)publicacion).getPeriodicidad());
//			}
//			else if (publicacion instanceof LibrosLectura) {
//				System.out.printf("[Libros De Lectura] --> Titulo: %s Año: %d Género: %s\n", publicacion.getTitulo(), 
//						((LibrosLectura)publicacion).getYear(), ((LibrosLectura) publicacion).getGenero());
//			}
//			else if (publicacion instanceof LibrosTexto) {
//				System.out.printf("[Libros De Lectura] --> Titulo: %s Editorial: %s Nivel: %s\n", publicacion.getTitulo(), 
//						((LibrosTexto)publicacion).getEditorial(), ((LibrosTexto) publicacion).getNivel());
//			}
//		}
		
		for (Publicacion publicacion : coleccion) {
			System.out.println(publicacion.dameDatos());
		}
		
		
		
	}

}
