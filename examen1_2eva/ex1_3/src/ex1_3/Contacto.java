package ex1_3;

import java.util.Objects;

public class Contacto {
	private Integer id;
	private String nombre;
	private String tlfn;
	private String email;

	public Contacto(Integer id, String nombre, String tlfn, String email) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tlfn = tlfn;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTlfn() {
		return tlfn;
	}

	public void setTlfn(String tlfn) {
		this.tlfn = tlfn;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contacto [id=" + id + ", nombre=" + nombre + ", tlfn=" + tlfn + ", email=" + email + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, nombre, tlfn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contacto other = (Contacto) obj;
		return Objects.equals(email, other.email) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(tlfn, other.tlfn);
	}

}
