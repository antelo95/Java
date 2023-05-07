package e8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class GestionProducto {
	private List<Producto> productos = new ArrayList<>();

	public GestionProducto() throws ClassNotFoundException, IOException {
		
		if (Files.exists(Paths.get("", "Productos.dat"))) {
			this.loadProductsFromDisk();
		} else {
			productos.addAll(Arrays.asList(new Producto[] {
				new Producto("1", "Pc Dell 8gb 500Hdd", 300.2, "PCDomino"),
				new Producto("2", "Brother printer 56W", 180.5, "PCDomino"),
				new Producto("3", "Logitech Mouse 3", 640.1, "PCDomino"),
				new Producto("4", "HD Seagate 500SDD", 640.9, "PCDomino")
			}));
		}
	}

	public void loadProductsFromDisk() throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ObjectInputStream oEntrada = new ObjectInputStream(new FileInputStream("Productos.dat"));
		productos = (List<Producto>) oEntrada.readObject();
		oEntrada.close();
	}
	
	public void saveProducts() throws FileNotFoundException, IOException {
		ObjectOutputStream oSalida = new ObjectOutputStream(new FileOutputStream("Productos.dat"));
		oSalida.writeObject(productos); // Escribir todo en el array
		oSalida.close();
	}
	
	public void addProducto(Producto p) {
		if (p != null && !productos.contains(p)) {
			productos.add(p);
		}
	}
	
	public int removeProductos(String... ids) {
		int contador = 0;
		for (String string : ids) {
			Optional<Producto> p = this.findById(string);
			if (p.isPresent()) {
				productos.remove(p.get());
				contador++;
			}
		}return contador;
	}
	
	public Optional<Producto> findById(String id) {
		return productos.stream()
					.filter(p -> p.getId().equals(id))
					.findFirst();
	}
	
	public void showProducts() {
		productos.stream().forEach(System.out::println);
	}
}
