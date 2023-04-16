package clases;

import lombok.Data;

@Data
public class Participante {
	private int id;
	private String nombre;
	private String apellido;
	private String correo;
	private String genero;
	
	public Participante(String linea) {
		String [] datos = linea.split(",");
		id = Integer.parseInt(datos[0]);
		nombre = datos[1];
		apellido = datos[2];
		correo = datos[3];
		genero = datos[4];
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Participante [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo
				+ ", genero=" + genero + "]";
	}
	
	
}
