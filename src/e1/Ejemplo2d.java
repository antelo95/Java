package e1;

import java.util.Random;

public class Ejemplo2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rdn = new Random();
		int a = 0;
		int mayor = 0;
		int menor = 0;
		for (int i = 0; i < 10; i++) {
			int num = rdn.nextInt(50) + 1;
			a += num;
			if (i == 0) {
				System.out.printf("Números: %d ", num);
				mayor = num;
				menor = num;
			} else {
				System.out.printf("%d ", num);
			}
			if (num < menor) {
				menor = num;
			}
			if (num > mayor) {
				mayor = num;
			}
		}
		System.out.printf("\nLa suma es: %d", a);
		System.out.printf("\nMayor: %d", mayor);
		System.out.printf("\nMenor: %d", menor);
		System.out.printf("\nMedia: %d", (a/10));
	}

}
