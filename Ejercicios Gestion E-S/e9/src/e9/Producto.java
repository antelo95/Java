package e9;

import java.util.Arrays;
import java.util.HashMap;

public class Producto {
	private String id;
	private String nombre;
	private HashMap<Integer, Integer> ventas = new HashMap<>();
	
	public Producto(String linea) {
		super();
		String datos [] = linea.split(";");
		this.id = datos[0];
		this.nombre = datos[1];
		String [] resto = Arrays.copyOfRange(datos, 2, datos.length);
		for (int i = 0; i < resto.length; i+=2) {
			ventas.put(Integer.parseInt(resto[i]), Integer.parseInt(resto[i+1]));
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public HashMap<Integer, Integer> getVentas() {
		return ventas;
	}

	public void setVentas(HashMap<Integer, Integer> ventas) {
		this.ventas = ventas;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", ventas=" + ventas + "]";
	}
	
	
	
	
}
