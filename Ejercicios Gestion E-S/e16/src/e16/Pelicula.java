package e16;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pelicula implements Serializable {
	private LocalDate fecha;
	private String titulo;
	private String resumen;
	private int popularidad;
	private double votos;
	private double puntuacion;
	private String idiomaOriginal;
	private List<String> generos = new ArrayList<>();
	private String urlCartel;
	public Pelicula(String linea) {
		super();
		String datos [] = linea.split("\\t");
		this.fecha = LocalDate.parse(datos[0]);
		this.titulo = datos[1];
		this.resumen = datos[2];
		this.popularidad = Integer.parseInt(datos[3].replace(".", ""));
		this.votos = Double.parseDouble(datos[4]);
		this.puntuacion = Double.parseDouble(datos[5]);
		this.idiomaOriginal = datos[6];
		this.generos = Arrays.asList(datos[7].split(", "));
		this.urlCartel = datos[8];
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getResumen() {
		return resumen;
	}
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}
	public int getPopularidad() {
		return popularidad;
	}
	public void setPopularidad(int popularidad) {
		this.popularidad = popularidad;
	}
	public double getVotos() {
		return votos;
	}
	public void setVotos(double votos) {
		this.votos = votos;
	}
	public double getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(double puntuacion) {
		this.puntuacion = puntuacion;
	}
	public String getIdiomaOriginal() {
		return idiomaOriginal;
	}
	public void setIdiomaOriginal(String idiomaOriginal) {
		this.idiomaOriginal = idiomaOriginal;
	}
	public List<String> getGeneros() {
		return generos;
	}
	public void setGeneros(List<String> generos) {
		this.generos = generos;
	}
	public String getUrlCartel() {
		return urlCartel;
	}
	public void setUrlCartel(String urlCartel) {
		this.urlCartel = urlCartel;
	}
	@Override
	public String toString() {
		return "Pelicula [fecha=" + fecha + ", titulo=" + titulo + ", resumen=" + resumen + ", popularidad="
				+ popularidad + ", votos=" + votos + ", puntuacion=" + puntuacion + ", idiomaOriginal=" + idiomaOriginal
				+ ", generos=" + generos + ", urlCartel=" + urlCartel + "]";
	}
	
	
}
