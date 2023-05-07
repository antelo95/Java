package e3;

import java.time.LocalDate;

public class Gasto {
	private String id;
	private LocalDate fecha;
	private double importe;
	private String descripcion;
	public Gasto(String id, LocalDate fecha, double importe, String descripcion) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.importe = importe;
		this.descripcion = descripcion;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Gasto [id=" + id + ", fecha=" + fecha + ", importe=" + importe + ", descripcion=" + descripcion + "]";
	}
	
	
}
