package e10;

import java.util.ArrayList;
import java.util.List;

public class Pais {
	private String nombre;
	private List<String> idiomas = new ArrayList<>();
	
	public Pais(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Pais(String nombre, List<String> idiomas) {
		super();
		this.nombre = nombre;
		this.idiomas = idiomas;
	}

	public void addIdioma(String idioma) {
		if (idioma!=null) idiomas.add(idioma);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<String> getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(List<String> idiomas) {
		this.idiomas = idiomas;
	}
	
	
}
