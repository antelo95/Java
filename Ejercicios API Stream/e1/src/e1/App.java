package e1;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		Ejercicio a)
		//IA contieneChar = (String cadena, char c) -> cadena.contains(Character.toString(c));
//		
//		String cadena = "Programo en Java";
//		System.out.println(contieneChar.checkString(cadena, 'J'));
//		IB mayor = (String cadena, String cadena1) -> {
//			return (cadena.length() > cadena1.length())? cadena:cadena1;
//		};
		
//		Ejercicio b)
//		String a = "Java"; String b = "mar";
//		System.out.println((mayor.returnBigger(a, b)));
		
//		Ejercicio c)
//		Icd suma = (int []a) -> {
//			int ac = 0;
//			for (int num : a) {
//				ac += num;
//			}return ac;
//		};
		//Ejercicio d)
//		int [] array = {10,2,3};
////		System.out.println(suma.getNumero(array));
////		Ejercicio d)
//		
//		Icd mayor = (int [] a) -> {
//			Arrays.sort(a);
//			return a[a.length -1];
//		};
//		System.out.println(mayor.getNumero(array));
		
		//Ejercicio e)
//		Ief mayor = (int a, int b) -> {
//			return (a > b)? a:b;
//		};
//		int a = 10; int b = 20;
//		System.out.println(mayor.getNum(a, b));
		//Ejercico f)
		Ief menor = (int a, int b) -> {
			return (a < b)? a:b;
		};
		int a = 10; int b = 20;
		System.out.println(menor.getNum(a, b));
	}

}
