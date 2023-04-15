package ex2_2;

public class LibrosTexto extends Publicacion {
	private String nivel;
	private String curso;
	
	public LibrosTexto(String id, String titulo, String editorial, int paginas, String nivel, String curso) {
		super(id, titulo, editorial, paginas);
		this.nivel = nivel;
		this.curso = curso;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "LibrosTexto [nivel=" + nivel + ", curso=" + curso + "]";
	}

	@Override
	public String dameDatos() {
		// TODO Auto-generated method stub
		return this.toString() + super.toString();
	}
	
	
	
	
	
}
