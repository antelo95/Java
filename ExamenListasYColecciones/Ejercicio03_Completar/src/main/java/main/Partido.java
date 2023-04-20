package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import lombok.Data;

@Data 
public class Partido {

	private String equipoLocal;
	private String equipoVisitante;
	private LocalDate fechaPartido;
	private int puntosLocal;
	private int puntosVisitante;
	
	public Partido(String datos) {
		String [] datosPartido = datos.split(",");
		this.equipoLocal = datosPartido[1];
		this.equipoVisitante = datosPartido[2];
		this.fechaPartido = fechaOf(datosPartido[0]);
		this.puntosLocal = Integer.parseInt(datosPartido[3]);
		this.puntosVisitante = Integer.parseInt(datosPartido[4]);
	}
	
	private LocalDate fechaOf(String f) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		LocalDate fecha = LocalDate.parse(f, formatter);
		return fecha;
	}
}
