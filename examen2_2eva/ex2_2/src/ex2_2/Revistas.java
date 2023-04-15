package ex2_2;

public class Revistas extends Publicacion{
	
	private String area;
	private String periodicidad;
	
	public Revistas(String id, String titulo, String editorial, int paginas, String area, String periodicidad) {
		super(id, titulo, editorial, paginas);
		this.area = area;
		this.periodicidad = periodicidad;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getPeriodicidad() {
		return periodicidad;
	}

	public void setPeriodicidad(String periodicidad) {
		this.periodicidad = periodicidad;
	}

	@Override
	public String toString() {
		return "Revistas [area=" + area + ", periodicidad=" + periodicidad + "]";
	}

	@Override
	public String dameDatos() {
		// TODO Auto-generated method stub
		return this.toString() + super.toString();
	}
	
	
	
	
	
	
	
	
}
