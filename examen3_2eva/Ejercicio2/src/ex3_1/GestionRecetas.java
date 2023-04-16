package ex3_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GestionRecetas {
	private Set<Receta> recetas = new HashSet<>();
	
	public void addReceta(Receta receta) {
		recetas.add(receta);
	}
	public void mostrar() {
		for (Receta receta : recetas) {
			System.out.println(receta.toString());
		}
	}
	public List<Receta> buscarRecetasIngrediente(String ingrediente) {
		List<Receta> nueva = new ArrayList<>();
		for (Receta receta : recetas) {
			if (receta.getIngredientes().containsKey(ingrediente)) {
				nueva.add(receta);
			}
		} return nueva;	
	}
	
	public void eliminarReceta(String id) {
		for (Receta receta : recetas) {
			if (receta.getId().equals(id)) {
				recetas.remove(receta);
				System.out.printf("La receta con id: %s se ha eliminado correctamente\n", id);
			}
		}
	}
	
	public List<Receta> buscarRecetaPorNombre(String texto) {
		List<Receta> coinciden = new ArrayList<>();
		for (Receta receta : recetas) {
			if (receta.getNombre().toLowerCase().contains(texto.toLowerCase())) {
				coinciden.add(receta);
			}
		}return coinciden;
	}
	
	public Boolean buscarIngredienteEnReceta(String id, String ingrediente) {
		for (Receta receta : recetas) {
			if (receta.getId().equalsIgnoreCase(id) && receta.getIngredientes().containsKey(ingrediente)) {
				return true;
			}
		} return false;
	}
	
}
