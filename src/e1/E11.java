package e1;

public class E11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = 4;
		System.out.println(devMes(month)); 
	}
	
	static String devMes(int mes) {
		String [] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo",
				"Junio", "Julio", "Agosto", "Septiembre", 
				"Octubre", "Noviembre", "Diciembre"};
		return meses[mes-1];
	}
}
