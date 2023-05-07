package e8;

import java.io.IOException;
import java.util.Optional;
import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			GestionProducto g = new GestionProducto();
			Menu menu = new Menu(
					new String[] { "Menú", "1. Nuevo", "2. Eliminar", "3. Mostrar", "4. Buscar por Id", "5. fin" });
			String opc = "";
			Scanner entrada = new Scanner(System.in);
			do {
				opc = menu.mostrarMenu();
				switch (opc) {

				case "1": {
					System.out.println("Nuevo producto");
					Random rnd = new Random();
					int num = rnd.nextInt(1500000);
					Producto pro = new Producto(num + "", "Pro" + num, num * 0.20304, "ProveedorH");
					g.addProducto(pro);
					break;
				}
				case "2": {
					System.out.println("Id a eliminar:");
					String id = entrada.next();
					g.removeProductos(id);
					break;
				}
				case "3": {
					g.showProducts();
					break;

				}

				case "4": {
					System.out.println("Buscar");
					System.out.println("Id a buscar:");
					String id = entrada.next();
					Optional<Producto> producto = g.findById(id);
					if (producto.isEmpty())
						System.out.println("No encontrado");
					else
						System.out.println(producto.get().toString());
					break;
				}

				case "5":
					System.out.println("Fin");
					try {
						g.saveProducts();
					} catch (IOException e) {
						System.out.println(e.getMessage());
					}
					break;
				default:
					System.out.println("Opción errónea");
				}

			} while (!opc.equals("5"));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
