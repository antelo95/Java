package ex2_2;

public  abstract class  Publicacion {
	
	private String id;
	private String titulo;
	private String editorial;
	private int paginas;
	
	public Publicacion(String id, String titulo, String editorial, int paginas) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.editorial = editorial;
		this.paginas = paginas;
	}
	public abstract String dameDatos();
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	@Override
	public String toString() {
		return "Publicacion [id=" + id + ", titulo=" + titulo + ", editorial=" + editorial + ", paginas=" + paginas
				+ "]";
	}
	
	
}
