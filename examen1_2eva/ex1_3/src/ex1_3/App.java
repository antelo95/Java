package ex1_3;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		List<Contacto> contactos = new ArrayList<>();
		contactos.add(new Contacto(1, "Ana", "111", "ana@gmail.com"));
		contactos.add(new Contacto(2, "Pepe", "222", "pepe@gmail.com"));
		contactos.add(new Contacto(3, "Ana", "111", "ana@gmail.com"));
		contactos.add(new Contacto(4, "Luis", "444" , "luis@gmailll.com"));
//		
		
//		Contacto [] contactos = {
//				new Contacto(1, "Ana", "ana@gmail.com", "111"),
//				new Contacto(2, "Pepe", "pepe@gmail.com", "222"),
//				new Contacto(3, "Ana", "ana@gmail.com", "111"),
//				new Contacto(4, "Luis", "luis@gmailll.com", "444")
//		};
		
		
		for (Contacto contacto : contactos) {
			if (contacto.getEmail().contains("@gmail.com")) {
				System.out.println(contacto.getEmail());
			}			
		}
		
		System.out.println(((contactos.get(0).equals(contactos.get(2)))));

	}

}
