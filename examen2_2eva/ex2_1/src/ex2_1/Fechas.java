package ex2_1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

public class Fechas implements IUtilesFechas{
	private LocalDate [] fechas = {LocalDate.of(1990, 10, 1),  
			LocalDate.of(1969, 10, 1),	LocalDate.of(2000, 10, 1), 
			LocalDate.of(2022, 10, 1), 
			LocalDate.of(2002, 10, 1), LocalDate.of(2023, 10, 1)};
	
	
	public Fechas() {
		Arrays.sort(fechas);
		this.mostrar();
	}
	
	private void mostrar() {
		System.out.println(Arrays.toString(fechas));
		
	}

	@Override
	public LocalDate getFechaMenor() {
		// TODO Auto-generated method stub
		return fechas[0];
	}

	@Override
	public int contarFechasPasadas() {
		// TODO Auto-generated method stub
		int fechasPasadas = 0;
		for (LocalDate fecha : fechas) {
			if (fecha.isBefore(LocalDate.now())) {
				fechasPasadas++;
			}
		}return fechasPasadas;
	}

	@Override
	public int getAniosEntre() {
		// TODO Auto-generated method stub
		int periodo = Period.between(fechas[0], fechas[fechas.length -1]).getYears();
		return periodo;
	}
}
