package main;

public class Aeropuerto {

	
	private String id;
	private String nombre;
	private String gpsCodigo;
	private String pais;
	private String continente;
	private double elevacion;
	
	public Aeropuerto(String linea) {
		
		String [] datos = linea.split(",");
		this.id=datos[0];
		this.nombre=datos[1];
		this.gpsCodigo=datos[2];
		this.pais=datos[3];
		this.continente=datos[4];
		this.elevacion= Double.parseDouble(datos[5])*29/100;
		
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

	public String getGpsCodigo() {
		return gpsCodigo;
	}

	public void setGpsCodigo(String gpsCodigo) {
		this.gpsCodigo = gpsCodigo;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getContinente() {
		return continente;
	}

	public void setContinente(String continente) {
		this.continente = continente;
	}

	public double getElevacion() {
		return elevacion;
	}

	public void setElevacion(double elevacion) {
		this.elevacion = elevacion;
	}

	@Override
	public String toString() {
		return "Aeropuerto [id=" + id + ", nombre=" + nombre + ", gpsCodigo=" + gpsCodigo + ", pais=" + pais
				+ ", continente=" + continente + ", elevacion=" + elevacion + "]";
	}
	
	
	
}
