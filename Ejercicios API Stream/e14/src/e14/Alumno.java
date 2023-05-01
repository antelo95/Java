package e14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Alumno {
	private String id;
	private String nombre;
	private List<Double> notas = new ArrayList<>();
	public Alumno(String linea) {
		super();
		String datos [] = linea.split(";");
		this.id = datos[0].trim();
		this.nombre = datos[1].trim();
		this.notas = Arrays.stream(Arrays.copyOfRange(datos, 2, datos.length))
				.map(Double::parseDouble)
				.toList();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Double> getNotas() {
		return notas;
	}
	public void setNotas(List<Double> notas) {
		this.notas = notas;
	}
	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", notas=" + notas + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
}
