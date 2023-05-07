package e3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

public class GestionGasto {
	private List<Gasto> gastos = new ArrayList<>();

	public GestionGasto() {
		for (int i = 1; i < 11; i++) {
			double impo = new Random().nextDouble(1, 100);
			int year = new Random().nextInt(1999, 2024); 
			gastos.add(new Gasto("0"+i, LocalDate.of(year, i, 1+i), impo, "Descripcion"+i));
		}
//		for (Gasto gasto : gastos) {
//			System.out.println(gasto.toString());
//		}
	}
	
	public Optional<Double> gastoXid(String id) {
		return gastos.stream()
						.filter(g -> g.getId().equals(id))
						.map(Gasto::getImporte)
						.findFirst();
	}
	
	public Double gastoYearMes(int year, int mes) {
		return gastos.stream()
				.filter(g -> g.getFecha().getMonthValue() == mes && g.getFecha().getYear() == year)
				.collect(Collectors.summingDouble(Gasto::getImporte));
	}
	public Optional<Gasto> getgastoById(String id) {
		return gastos
			.stream()
			.filter(g->g.getId().equals(id))
			.findFirst();
	}
	public void mostarIdDesc(String [] ids) {
		Arrays.stream(ids)
			.map(this::getgastoById)
			.forEach((elemento) ->{
				if (!elemento.isEmpty())
					System.out.println(elemento.get().toString());
			});
	}
}
