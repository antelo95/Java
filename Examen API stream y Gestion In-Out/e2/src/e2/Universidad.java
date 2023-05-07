package e2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Universidad {
	private String id;
	private String pais;
	private String uni;
	public Universidad(String linea) {
		super();
		String datos [] = linea.split(",");
		this.id = datos[0];
		this.pais = datos[1];
		this.uni = Arrays.stream(Arrays.copyOfRange(datos, 2, datos.length))
				.collect(Collectors.joining());	
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getUni() {
		return uni;
	}
	public void setUni(String uni) {
		this.uni = uni;
	}
	@Override
	public String toString() {
		return "Universidad [id=" + id + ", pais=" + pais + ", uni=" + uni + "]";
	}
	
	
	
	
}
