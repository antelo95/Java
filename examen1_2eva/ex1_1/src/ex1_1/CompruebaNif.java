package ex1_1;

import java.util.ArrayList;
import java.util.List;

public class CompruebaNif {
	
	public static List<String> getCorrectos(String [] nifs) {
		List<String> correctos = new ArrayList<>();
		for (String string : nifs) {
			if (esCorrecto(string)) {
				correctos.add(string);
			}
		}
		return correctos;
	}
	
	public static boolean esCorrecto(String nif) {
		String[] letras = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V",
				"H", "L", "C", "K", "E" };
		int num = Integer.parseInt(getNumero(nif));
		String letra = getLetra(nif);
		return (letras[num % 23].equals(letra));

	}

	public static boolean esIncorrecto(String nif) {
		return !esCorrecto(nif);
	}

	private static String getNumero(String nif) {
		String num = nif.substring(0, nif.length() - 1);
		return num;
	}

	private static String getLetra(String nif) {
		return nif.substring(nif.length() - 1);
	}
}
