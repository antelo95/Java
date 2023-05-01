package e13;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pelicula {
	private int id;
	private int year;
	private int duracion;
	private String titulo;
	private String tipo;
	private List<String> actores = new ArrayList<>();
	private String director;
	private int popularidad;
	private boolean premiada;
	public Pelicula(int id, String linea) {
		super();
		this.id = id;
		String [] datos = linea.split(";");
		this.year = (datos[0].equals(""))? 97 : Integer.parseInt(datos[0]);
		this.duracion = (datos[1].equals(""))? 97 : Integer.parseInt(datos[1]);
		this.titulo = datos[2].trim();
		this.tipo = datos[3].trim();
		actores.add(datos[4].trim());
		actores.add(datos[5].trim());
		this.director = (datos[6].equals(""))? datos[2]:datos[6];
		this.popularidad = (datos[7].equals(""))? 97 : Integer.parseInt(datos[7]);
		this.premiada = (datos[8].equals("No"))? false : true;
	}
	@Override
	public String toString() {
		return "Pelicula [id=" + id + ", year=" + year + ", duracion=" + duracion + ", titulo=" + titulo + ", tipo="
				+ tipo + ", actores=" + actores + ", director=" + director + ", popularidad=" + popularidad
				+ ", premiada=" + premiada + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public List<String> getActores() {
		return actores;
	}
	public void setActores(List<String> actores) {
		this.actores = actores;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getPopularidad() {
		return popularidad;
	}
	public void setPopularidad(int popularidad) {
		this.popularidad = popularidad;
	}
	public boolean isPremiada() {
		return premiada;
	}
	public void setPremiada(boolean premiada) {
		this.premiada = premiada;
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
		Pelicula other = (Pelicula) obj;
		return id == other.id;
	}
	
	
}
