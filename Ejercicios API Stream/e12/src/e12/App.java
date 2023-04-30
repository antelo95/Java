package e12;

import java.util.Optional;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GestionEmpleado g = new GestionEmpleado();
		
		Optional<Empleado> e =g.buscarId(1);
		if (!e.isEmpty()) System.out.println(e.get());
		System.out.println("Listar empleados...");
		Integer [] ids = {1,2,33,44};
		g.listarEmpleadosIds(ids);
	}

}
