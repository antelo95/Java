package e9;

import java.io.Serializable;

public class VentasYear implements Serializable{
		private Integer anio;
		private String producto;
		private Integer unidadesVendidas;
		public VentasYear(Integer anio, String producto, Integer unidadesVendidas) {
			super();
			this.anio = anio;
			this.producto = producto;
			this.unidadesVendidas = unidadesVendidas;
		}
		public Integer getAnio() {
			return anio;
		}
		public void setAnio(Integer anio) {
			this.anio = anio;
		}
		public String getProducto() {
			return producto;
		}
		public void setProducto(String producto) {
			this.producto = producto;
		}
		public Integer getUnidadesVendidas() {
			return unidadesVendidas;
		}
		public void setUnidadesVendidas(Integer unidadesVendidas) {
			this.unidadesVendidas = unidadesVendidas;
		}
		@Override
		public String toString() {
			return "VentasYear [anio=" + anio + ", producto=" + producto + ", unidadesVendidas=" + unidadesVendidas
					+ "]";
		}
		
		
		
		
}

