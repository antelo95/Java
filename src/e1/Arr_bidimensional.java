package e1;

import java.util.Scanner;

public class Arr_bidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = new int [4][5];
		Scanner input = new Scanner(System.in);
		

		for(int i =0; i<4;i++) {
			for(int j=0; j<5; j++){
				arr[i][j] = input.nextInt();
			}
			
		}
		for(int i =0; i<4;i++) {
			for(int j=0; j<5; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
