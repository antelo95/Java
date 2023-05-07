package e9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GestionProductos {
	List<Producto> productos = new ArrayList<>();

	public GestionProductos() throws IOException {
		Path path = Paths.get("", "datosProductos.txt");
		if (Files.exists(path)) {
			List<String> lineas = Files.readAllLines(Paths.get("datosProductos.txt"));
			for (String string : lineas) {
				productos.add(new Producto(string));
			}
		}else {
			System.out.println("La ruta no existe.");
		}
	}
	
	public Optional<Producto> buscarPorId(String id) {
		return productos.stream()
					.filter(p -> p.getId().equals(id))
					.findFirst();
	}
	
	public void mostrarProductos() {
		productos.forEach(System.out::println);
	}
	
	public void vendidosMasDe(int unidades) {
		for (Producto producto : productos) {
			int suma = 0;
			Collection<Integer> ventas = producto.getVentas().values();
			for (Integer integer : ventas) {
				suma += integer;
			}
			if (suma > unidades) System.out.println(producto.toString());
		}
	}
	
	public List<VentasYear> getVentasYear(int year) {
		return productos.stream()
					.map(p -> {
						int unidades = (p.getVentas().containsKey(year))?
								p.getVentas().get(year): 0;
						return (new VentasYear(year, p.getNombre(), unidades));
					}).collect(Collectors.toList());
	}
	
	public void ventasYearAFichero(int year) throws FileNotFoundException, IOException {
		String nombreFichero = "ventas"+ year+ ".txt";
		ObjectOutputStream oSalida = new ObjectOutputStream(new FileOutputStream(nombreFichero));
		oSalida.writeObject(this.getVentasYear(year));
		oSalida.close();
		System.out.println("Fichero creado!!");
	}
	
	public void cargarFichero(String fichero) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream oEntrada = new ObjectInputStream(new FileInputStream(fichero));
		productos = (List<Producto>) oEntrada.readObject();
		oEntrada.close();
		System.out.println("Fichero leido!!!");
	}
	
	
}
