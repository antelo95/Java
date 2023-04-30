package e6;

import java.util.Objects;

public class Jugador {
	private String id;
	private String nombre;
	private double peso;
	private double altura;
	public Jugador(String id, String nombre, double peso, double altura) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.peso = peso;
		this.altura = altura;
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
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "Jugador [id=" + id + ", nombre=" + nombre + ", peso=" + peso + ", altura=" + altura + "]";
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
		Jugador other = (Jugador) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
