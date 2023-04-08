package main;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class GestionAeropuertos {

	Aeropuerto [] aeros = null;

	public GestionAeropuertos() {
		try {
			List<String> lines = Files.readAllLines(Paths.get("aeropuertos.csv"), 
					StandardCharsets.UTF_8);
			aeros = new Aeropuerto[lines.size()];
			int i=0;
			for (String string : lines) {
				
				aeros[i] = new Aeropuerto(string);
				i++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void mostrar() {
		for (Aeropuerto aeropuerto : aeros) {
			System.out.println(aeropuerto.toString());
		}
	}
	public Aeropuerto buscarAeropuertoPorId(String id) {
		for (Aeropuerto aeropuerto : aeros) {
			if (aeropuerto.getId().equals(id)) {
				return aeropuerto;
			}
		}
		return null;
	}
	public double elevacionMedia(String pais) {
		int c = 0;
		double elevacion= 0.0;
		for (Aeropuerto aeropuerto : aeros) {
			if (aeropuerto.getPais().equalsIgnoreCase(pais)) {
				elevacion += aeropuerto.getElevacion();
				c++;
			}
		}
		return (c==0)? 0: elevacion/c;
	}
	
	public boolean cambiarElevacionAeropuerto(String id, double nuevaElevacion) {
		Aeropuerto a = this.buscarAeropuertoPorId(id);
		if (a != null) {
			a.setElevacion(nuevaElevacion);
			return true;
		}else {
			return false;
		}
	}
	
	public double getElevacionAeropuerto(String id) {
		Aeropuerto a = this.buscarAeropuertoPorId(id);
		if (a != null) {
			return a.getElevacion() * 3.281;
		} else 
			return -1;
	}
	
	public void mostrarAeroPaises(String...paises){
		List<String> listaP = Arrays.asList(paises);
		for (String pais : listaP) {
			System.out.println(pais);
			for (Aeropuerto aero : aeros) {
				if (aero.getPais().equals(pais)) {
					System.out.printf("\t %s\n", aero.getNombre());
				}
			}
		}
	}
	
	public String[] aeroPais(String pais) {
		List<String> listP = new ArrayList<>();
		for (Aeropuerto aero : aeros) {
			if (aero.getPais().equalsIgnoreCase(pais)) {
				listP.add(aero.getNombre());
			}
		}
		return  listP.toArray(new String[listP.size()]);
	}
	
	public void contarPorContinente() {
		HashMap<String, Integer> aeroCont = new HashMap<>();
		for (Aeropuerto aeropuerto : aeros) {
			if (!aeroCont.containsKey(aeropuerto.getContinente())) {
				aeroCont.put(aeropuerto.getContinente(), 1);
			} else {
				Integer num =aeroCont.get(aeropuerto.getContinente());
				num++;
				aeroCont.put(aeropuerto.getContinente(), num);
			}
		}
		
		aeroCont.forEach((key, value) -> 
			System.out.printf("Continente %s: %d aeropuertos\n", key, value));
	}
		
}
