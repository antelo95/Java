package e12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class GestionEmpleado {
	private List<Empleado> empleados = new ArrayList<>();

	public GestionEmpleado() {
		for (int i = 1; i <=10; i++) {
			empleados.add(new Empleado(0+i, "Empleado"+i, new Random().nextDouble(943.2, 2222.9)));
		}
	}
	
	public void addEmpleado(Empleado e) {
		empleados.add(e);
	}
	
	public Optional<Empleado> buscarId(Integer id) {
		 return empleados.stream()
				.filter(e -> e.getId() == id)
				.findFirst();
	}
	
	public void listarEmpleadosIds(Integer [] ids) {
		Arrays.stream(ids)
		.map(this::buscarId)
		.forEach((elemento) ->{
			if (!elemento.isEmpty())
				System.out.println(elemento.get().toString());
		});
	}
	
}
