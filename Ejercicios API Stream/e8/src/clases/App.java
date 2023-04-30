
package clases;

import java.util.List;
import java.util.Optional;

/**
 * 
 * @author javie
 *
 */
public class App {

	
	public static void main(String[] args) {
		// TODO code application logic here
		
		ColeccionMultas m = new ColeccionMultas();
		for (Multa multa : m.getMultas()) {
			System.out.println(multa.toString());
		}
		
		System.out.println("**************");
//		System.out.println(m.multasAsocidasMatrícula("1299-BMX"));
		
		//System.out.println(m.sumaImportesMultasAsociadasMatrícula("1299-BMX"));
		
		//System.out.println(m.importeMedioMultasMesYAño(4, 2000));
//		List<Multa> multas = m.multasAsociadasMatrícula("1299-BMX");
//		for (Multa multa : multas) {
//			System.out.println(multa.toString());
//		}
//		Optional<Multa> multa = m.primeraMultasAsociadasMatrícula("1299-BMX");
//		System.out.println((multa.isEmpty())? "no": multa.get());
		System.out.println(m.importesSuperioresA("1299-BMX", 20));
	}
}
