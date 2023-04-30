package clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

public class ColeccionMultas {

	List<Multa> multas = new ArrayList<>();

	public ColeccionMultas() {
		Random rnd = new Random();
		String[] matriculas = { "1299-BMX", "3899-KML", "9099-JKL", "3737-NMS", "4566-CMC", "9001-BMT", "3201-KKL",
				"8012-BCD" };
		Double[] importes = { 50.0, 100.0, 150.0, 200.0, 250.0, 300.0 };
		for (int i = 0; i < 20; i++) {
			multas.add(new Multa(matriculas[rnd.nextInt(matriculas.length)],
					LocalDate.of(2000 + rnd.nextInt(22), rnd.nextInt(12) + 1, rnd.nextInt(28) + 1),
					importes[rnd.nextInt(importes.length)]));
		}
		
	}
	
	public List<Multa> getMultas() {
		return multas;
	}

	public int multasAsocidasMatrícula(String matricula) {
		long numMultas = multas.stream()
				.filter(m -> m.getMatricula().equalsIgnoreCase(matricula))
				.count();
		return (int) numMultas;
	}
	
	public double sumaImportesMultasAsociadasMatrícula(String matricula) {
		double suma = multas.stream()
						.filter(m -> m.getMatricula().equalsIgnoreCase(matricula))
						.collect(Collectors.summingDouble(Multa::getImporteMulta));
		return suma;
	}
	
	public double  importeMedioMultasMesYAño(int mes, int year) {
		double media = multas.stream()
				.filter(f -> f.getFechaMulta().getMonthValue() == mes && 
				f.getFechaMulta().getYear() == year)
				.collect(Collectors.averagingDouble(Multa::getImporteMulta));
		return media;
	}
	
	public List<Multa> multasAsociadasMatrícula(String matricula) {
		List<Multa> multasMatricula= multas.stream()
									.filter(m -> m.getMatricula().equalsIgnoreCase(matricula))
									.collect(Collectors.toList());
		return multasMatricula;
	}
	
	public Optional<Multa> primeraMultasAsociadasMatrícula(String matricula) {
		Optional<Multa> multa = multas.stream()
							.filter(m -> m.getMatricula().equalsIgnoreCase(matricula))
							.sorted(Comparator.comparing(Multa::getFechaMulta))
							.findFirst();
		return multa;
	}
	
	public boolean importesSuperioresA(String matricula, double importe ) {
		return multas.stream()
					.filter(m -> (m.getMatricula().equalsIgnoreCase(matricula)))
					.allMatch(m -> m.getImporteMulta() > importe);
	}

}
