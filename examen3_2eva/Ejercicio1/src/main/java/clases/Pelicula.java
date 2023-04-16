package clases;

import lombok.Data;

@Data
public class Pelicula {
	private int anio;
	private int duracion;
	private String titulo;
	private String tipo;
	private String actriz;
	private String actor;
	private String director;
	private int popularidad;
	private boolean premiada;
	public Pelicula(String linea) {
		String [] datos = linea.split(";");
		anio = (datos[0].equals(""))? 97: Integer.parseInt(datos[0]);
		duracion = (datos[1].equals(""))? 97: Integer.parseInt(datos[1]);
		titulo = datos[2].trim();
		tipo = datos[3].trim();
		actriz = datos[5].trim();
		actor = datos[4].trim();
		director = datos[6].equals("")? datos[2]: datos[6];
		popularidad = (datos[7].equals(""))? 97: Integer.parseInt(datos[7]);
		premiada = (datos[8].equals("No"))? false: true;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
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
	public String getActriz() {
		return actriz;
	}
	public void setActriz(String actriz) {
		this.actriz = actriz;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
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
	public String toString() {
		return "Pelicula [anio=" + anio + ", duracion=" + duracion + ", titulo=" + titulo + ", tipo=" + tipo
				+ ", actriz=" + actriz + ", actor=" + actor + ", director=" + director + ", popularidad=" + popularidad
				+ ", premiada=" + premiada + "]";
	}
	
	
	
	
}
