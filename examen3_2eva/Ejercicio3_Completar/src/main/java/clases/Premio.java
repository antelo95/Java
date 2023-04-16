package clases;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor

public class Premio {
	
	public Premio(int id, String descripcion, double valor) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.valor = valor;
	}
	private int id;
	private String descripcion;
	private double valor;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Premio [id=" + id + ", descripcion=" + descripcion + ", valor=" + valor + "]";
	}
	
}
