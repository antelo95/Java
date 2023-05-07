package e7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Alumno {
	private String id;
	private String nombre;
	private List<Double> notas = new ArrayList<>();
	public Alumno(String linea) {
		super();
		String [] datos = linea.split(";");
		this.id = datos[0];
		this.nombre = datos[1];
		this.notas = Arrays.stream(Arrays.copyOfRange(datos, 2, datos.length))
							.map((String s) -> (Double.parseDouble(s)))
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
	
	public double getMediaNotas() {
		return notas.stream()
					.collect(Collectors.averagingDouble(Double::doubleValue));
	}
	
	public double getMejorNota() {
		return notas.stream()
						.sorted(Comparator.reverseOrder())
						.findFirst()
						.get();
	}
	
}
