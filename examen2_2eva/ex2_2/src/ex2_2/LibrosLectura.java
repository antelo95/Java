package ex2_2;

public class LibrosLectura extends Publicacion {
	
	private int year;
	private String genero;
	
	public LibrosLectura(String id, String titulo, String editorial, int paginas, int year, String genero) {
		super(id, titulo, editorial, paginas);
		this.year = year;
		this.genero = genero;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "LibrosLectura [year=" + year + ", genero=" + genero + "]";
	}

	@Override
	public String dameDatos() {
		// TODO Auto-generated method stub
		return this.toString() + super.toString();
	}
	
	
	
	
	
}
