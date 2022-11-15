package e1;

import java.util.Random;
import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random rdn = new Random();
		
		int ad = rdn.nextInt(100) + 1;
		System.out.println(ad);
		System.out.println("Dime un nº: ");
		int num = input.nextInt();
		
		while(ad != num) {
			if (num > ad) {
				System.out.println("El nº es menor");
			} else {
				System.out.println("El nº es mayor");
			}
			System.out.println("Dime un nº: ");
			num = input.nextInt();
		}
		System.out.printf("El nº que buscabas era %d", ad);
	}

}
