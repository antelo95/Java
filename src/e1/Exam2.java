package e1;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce filas: ");
		int x = input.nextInt();
		System.out.println("Introduce columnas: ");
		int y = input.nextInt();
		System.out.println("Introduce caracter: ");
		char c = input.next().charAt(0);
		
		if ((x >= 3 && x<=6) && (y>=10 && y<=15)) {
			for(int i = 0; i<y;i++) {
				for (int j = 0; j<x; j++) {
					System.out.print(c);
				}
				System.out.println();
			}
		}
	}

}
