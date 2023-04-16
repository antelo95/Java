package ex3_1;

import java.util.HashMap;
import java.util.Objects;

public class Receta {

	private String id;
	private String nombre;
	private HashMap<String, Double> ingredientes = new HashMap<>();
	public Receta(String id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	
	public void addIngrediente(String nombre, Double cantidad) {
		if (cantidad != null && nombre != null) {
			ingredientes.put(nombre, cantidad);
		}
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

	public HashMap<String, Double> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(HashMap<String, Double> ingredientes) {
		this.ingredientes = ingredientes;
	}

	@Override
	public String toString() {
		return "Receta [id=" + id + ", nombre=" + nombre + ", ingredientes=" + ingredientes + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Receta other = (Receta) obj;
		return Objects.equals(id, other.id) && Objects.equals(nombre, other.nombre);
	}

	

	
	
	

}
