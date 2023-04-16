package ex3_1;

import java.util.Iterator;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GestionRecetas gestion = new GestionRecetas();
		
		Receta r1 = new Receta("1", "Huevos fritos con chorizo");
		Receta r2 = new Receta("2", "Huevos fritos con patatas");
		Receta r3 = new Receta("3", "Huevos revueltos");
		Receta r4 = new Receta("4", "Gazpacho extremeño");
		Receta r5 = new Receta("5", "Cocido");
		Receta r6 = new Receta("5", "Cocido extremeño");
		r1.addIngrediente("huevos", 2.0);
		r1.addIngrediente("chorizo", 1.0);
		r2.addIngrediente("huevos", 2.0);
		r2.addIngrediente("patatas", 1.0);
		r3.addIngrediente("huevos", 2.0);
		r4.addIngrediente("tomate", 1.5);
		r4.addIngrediente("pepino", 1.0);
		r4.addIngrediente("ajo", 1.0);
		r4.addIngrediente("aceite", 0.25);
		r5.addIngrediente("garbanzos", 1.0);
		r5.addIngrediente("morcilla", 1.0);
		r5.addIngrediente("tocino", 0.5);
		r6.addIngrediente("garganzos", 1.0);
		
		gestion.addReceta(r1);gestion.addReceta(r2);
		gestion.addReceta(r3);gestion.addReceta(r4);
		gestion.addReceta(r5);
		
		//gestion.mostrar();
//		List<Receta> coinciden = gestion.buscarRecetaPorNombre("cho");
//		for (Receta receta : coinciden) {
//			System.out.println(receta.toString());
//		}
		//gestion.addReceta(new Receta("8", "Bacalaillas"));
//		List<Receta>  contienen = gestion.buscarRecetasIngrediente("huevos");
//		for (Receta receta : contienen) {
//			System.out.println(receta.toString());
//		}
		gestion.mostrar();
		gestion.eliminarReceta("1");
		System.out.println("------");
		
		gestion.mostrar();
		
	}

}
